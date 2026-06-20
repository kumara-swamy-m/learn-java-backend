package com.kumara.learning;

public interface Course {
    boolean coursePurchased();
}

class JavaCourse implements Course{
    public boolean coursePurchased(){
        System.out.println("Purchased java Course");
        return true;
    }
}
class AWSCourse implements Course{
    public boolean coursePurchased(){
        System.out.println("Currently No Course ");
        return false;
    }
}
class SpringCourse implements Course{
    public boolean coursePurchased(){
        System.out.println("Purchased Spring Course");
        return true;
    }
}

class PurchaseCourse{
    private Course course;
    public boolean proccedWithCourse(Course course){
         return course.coursePurchased();

    }
}
