package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CseControllerTest {
    
    @Autowired
    private CseController c;

    @Test
    void testAdd() {
        String result = c.addCSE(2, 3);
        // Check if result contains the expected text and value
        assertTrue(result.contains("result added by 23mh1a05i7: 5"));
    }
}