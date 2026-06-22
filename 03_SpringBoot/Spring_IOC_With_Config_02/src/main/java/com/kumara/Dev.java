package com.kumara;

public class Dev {

    private Laptop laptop;
    private int age;

    public Dev(){
        System.out.println("Dev Constructor");
    }

    public Dev(Laptop laptop) {
        System.out.println("Dev  para  Constructor");
        this.laptop = laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    public  void build(){
        System.out.println("Building");
        laptop.compile();


    }
}
