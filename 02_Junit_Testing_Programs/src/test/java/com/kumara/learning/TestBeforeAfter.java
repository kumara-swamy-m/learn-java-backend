package com.kumara.learning;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBeforeAfter {
    ReverseString reverse;
    @BeforeEach
    void intial() {
          reverse= new ReverseString();
        System.out.println("Before test");
    }
    @Test
    void reverseJava() {

        assertEquals("avaJ", reverse.reverseString("Java"));
        System.out.println("Actual test Running");
    }

    @Test
    void reverseUMara() {
        assertEquals("araMuK", reverse.reverseString("KuMara"));
        System.out.println("Actual test Running");

    }
    @Test
    void reverse_multipe_words() {
        assertEquals("ysae si avaJ", reverse.reverseString("Java is easy"));
        System.out.println("Actual test Running");

    }

    @AfterEach
    void destroy(){
        System.out.println("After test");
    }

}
