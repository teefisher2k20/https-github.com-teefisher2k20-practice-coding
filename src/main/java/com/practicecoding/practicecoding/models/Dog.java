package com.practicecoding.practicecoding.models;

import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Dog {
    @NotBlank(message = "Dog name can't be blank!" )
    @NotNull
    @Size(min=3, message="Needs to be longer")
    private String name;

    @Min(value = 1, message = "Cannot be lower than 0")
    private int age;

    public Dog() {
        this("",0);
    }
//NotBlank and @NotNull are Annotations that prevent the user from returning a blank name
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
