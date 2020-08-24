package com.example.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;

import static java.util.Collections.singletonList;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class ControllerTest {
    @Test
    void greeting() throws Exception {
        Repo stubRepo = () -> singletonList("Hello World!");

        MockMvc mockMvc = standaloneSetup(new Controller(stubRepo)).build();

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0]", equalTo("Hello World!")));
    }
}
