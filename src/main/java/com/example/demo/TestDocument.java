package com.example.demo;

import java.util.Optional;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TestDocument {

    @Id
    private String id;
    private final String name;
    private final String nullableProperty;

    public TestDocument(String name, String nullableProperty) {
        this.name = name;
        this.nullableProperty = nullableProperty;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Optional<String> getNullableProperty() {
        return Optional.ofNullable(this.nullableProperty);
    }
}
