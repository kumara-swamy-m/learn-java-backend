package com.kumara.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ShapesTest {
    Shapes shape = new Shapes();
    @Test
    void testcalcSquareArea(){

        assertEquals(400,shape.calcSquareArea(20));


    }
    @Test
    void testcalcCircleArea(){
        assertEquals(3.14,shape.calcCircleArea(1),"This Circle Area calculation is  wrong");

    }
    @Test
    void testcalcCircleArea_Supplier(){ //This lamda fuctions makes the assertion evaluate string only when it fails
        assertEquals(3.14,shape.calcCircleArea(1),()->"This Circle Area calculation is  wrong");

    }

}