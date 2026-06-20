package com.kumara.learning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ShapesTestAsserNotEqual {
    Shapes shape1 = new Shapes();
    @Test
    void testcalcSquareArea(){

        assertNotEquals(4000,shape1.calcSquareArea(20));
    }
    @Test
    void testcalcSquareArea_with_message(){

        assertNotEquals(4050,shape1.calcSquareArea(20),()->"msg to dev that test case is failed");
    }
    @Test
    void testcalcSquareArea_with_Supplier(){

        assertNotEquals(400,shape1.calcSquareArea(20),()->"msg to dev that test case is failed");
    }
}
