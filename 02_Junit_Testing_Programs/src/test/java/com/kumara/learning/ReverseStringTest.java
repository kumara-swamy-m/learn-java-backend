package com.kumara.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ReverseStringTest {
    ReverseString reverse = new ReverseString();
    @Test
    void reverseJava() {

        assertEquals("avaJ", reverse.reverseString("Java"));
    }

    @Test
    void reverseUMara() {
        assertEquals("araMuK", reverse.reverseString("KuMara"));
    }
    @Test
    void reverse_multipe_words() {
        assertEquals("ysae si avaJ", reverse.reverseString("Java is easy"));
    }
}