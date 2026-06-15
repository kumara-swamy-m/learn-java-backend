package com.kumara.learning;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBeforeAllAfterAll {
    ReverseString reverse;


    @BeforeAll
    static void start(){
        System.out.println("Before all tests");
    }
    @BeforeEach
    void init() {
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
    @AfterAll

    static void end(){
        System.out.println("Cleaninf up after all tests");
    }

}
