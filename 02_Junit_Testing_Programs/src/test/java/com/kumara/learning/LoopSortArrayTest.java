package com.kumara.learning;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class LoopSortArrayTest {
    LoopSortArray ls = new LoopSortArray();
    @Test
    void test_sortArray_Performance(){
       int []arr={2,3,4,5};
       assertTimeout(Duration.ofMillis(9),()->ls.sortArray(arr));

    }

}