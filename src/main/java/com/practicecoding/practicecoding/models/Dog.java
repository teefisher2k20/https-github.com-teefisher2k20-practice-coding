package com.practicecoding.practicecoding.models;

import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Dog extends Pet {


    @NotBlank(message = "Dog name can't be blank!")
    @NotNull
    @Size(min = 3, message = "Needs to be longer")
    private String name;


    public Dog() {
    }

    public Dog(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "My dogs name is " + this.name + " and is " + this.getAge() + " years old";
    }
}
