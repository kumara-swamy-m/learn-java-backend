package com.kumara.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseCourseTest { PurchaseCourse pc = new PurchaseCourse();


    @Test
    void testproccedWithCourse(){

        boolean status=pc.proccedWithCourse(new JavaCourse());
        assertTrue(status);
    }
    @Test
    void testproccedWithCourse_aws(){

        boolean status=pc.proccedWithCourse(new AWSCourse());
        assertFalse(status);
    }

}