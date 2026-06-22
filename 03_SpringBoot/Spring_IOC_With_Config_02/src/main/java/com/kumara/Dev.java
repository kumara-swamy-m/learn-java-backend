package com.kumara;

public class Dev {

    private Computer  comp;
    private int age;

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public Dev(){
        System.out.println("Dev Constructor");
    }





    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    public  void build(){
        System.out.println("Building");
        comp.compile();


    }
}
