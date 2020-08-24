package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private final Repo repo;

    public Controller(Repo repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<String> getAll() {
        return repo.getAll();
    }
}
