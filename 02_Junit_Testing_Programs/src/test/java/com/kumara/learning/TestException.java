package com.kumara.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestException {
    SortingArray array = new SortingArray();

    @Test
    void testSortingArrayException() {

//    try{
//        int [] unsorted= null;
//        int [] sortedArray=array.sortingArray(unsorted);
//        for(int elem: sortedArray)
//
//            System.out.print(elem);
//
//        System.out.println("Statements below exception");
//        fail();
//
//    }
//catch(NullPointerException e){
//
//            System.out.println("Exception generated");
//    }

//Fails the test if no Exception

        int[] unsorted = null;

        assertThrows(NullPointerException.class, () -> {
            array.sortingArray(unsorted);
        });
    }
}