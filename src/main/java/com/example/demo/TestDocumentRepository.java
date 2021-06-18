package com.example.demo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestDocumentRepository extends MongoRepository<TestDocument, String> {

    List<TestDocumentProjection> findByName(String name);
}
