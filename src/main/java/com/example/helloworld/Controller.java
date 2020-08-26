package com.example.helloworld;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

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

    @PostMapping
    @ResponseStatus(CREATED)
    public Integer create(@RequestBody NewGreeting newGreeting) {
        return repo.create(newGreeting.getSentence());
    }
}
