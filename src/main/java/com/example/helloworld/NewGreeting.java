package com.example.helloworld;

import java.util.Objects;

public class NewGreeting {
    String sentence;

    public NewGreeting() {
    }

    public NewGreeting(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewGreeting that = (NewGreeting) o;
        return Objects.equals(sentence, that.sentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentence);
    }

    @Override
    public String toString() {
        return "NewGreeting{" +
                "sentence='" + sentence + '\'' +
                '}';
    }
}

