package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private TestDocumentRepository repository;

    @Test
    void testFindByName() {
        repository.save(new TestDocument("Simon", "test"));
        repository.save(new TestDocument("Simon", null));
        final List<TestDocumentProjection> findByName = repository.findByName("Simon");
        assertThat(findByName).hasSize(2);
    }

}
