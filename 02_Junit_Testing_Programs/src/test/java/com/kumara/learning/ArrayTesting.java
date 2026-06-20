package com.kumara.learning;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayTesting {
    @Test
    void testArrays(){
        int[]expected = {2,4,6,8};
        int[]actual = {4,2,8,6};
      //  assertArrayEquals(expected,actual); Test fails beacuse of order
        Arrays.sort(actual);
        assertArrayEquals(expected,actual);


    }
}
