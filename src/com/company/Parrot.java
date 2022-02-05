package com.company;

public class Parrot {
    private String name;
    private int age;
    private String color;

    public Parrot(){
        System.out.println("default constructor");
    }

    public Parrot(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color =color;
        System.out.println("second constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getParrotInfo(){
        System.out.println("name: "+getName());
        System.out.println("age: "+getAge());
        System.out.println("color: "+getColor());
    }
}
