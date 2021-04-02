package com.practicecoding.practicecoding.models;

public class Dog {

    private String name;
    private int age;

    public Dog(String name, int age) {

        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "My dogs name is " + this.name + " and is " + age + " years old";
    }
}
