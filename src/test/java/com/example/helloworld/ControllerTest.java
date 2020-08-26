package com.example.helloworld;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class ControllerTest {
    private MockMvc mockMvc;
    private String create_calledWith;

    @BeforeEach
    void setUp() {
        create_calledWith = null;
        Repo stubRepo = new Repo() {
            @Override
            public List<String> getAll() {
                return singletonList("Hello World!");
            }

            @Override
            public Integer create(String sentence) {
                create_calledWith = sentence;
                return 1;
            }
        };
        mockMvc = standaloneSetup(new Controller(stubRepo)).build();
    }

    @Test
    void getAll() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0]", equalTo("Hello World!")));
    }

    @Test
    void create_request() throws Exception {
        mockMvc.perform(post("/")
                .content("{\"sentence\":\"こんにちは！\"}")
                .contentType(APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$", equalTo(1)));

        assertThat(create_calledWith).isEqualTo("こんにちは！");
    }
}
