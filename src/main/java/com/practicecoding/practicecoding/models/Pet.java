package com.practicecoding.practicecoding.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@MappedSuperclass
public abstract class Pet {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message = "Name can't be blank!!")
    @NotNull
    @Size(min = 3, max = 15, message = "Needs to be longer")
    private String ownerName;

    @Min(value = 1, message = "Cannot be lower than 0")
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
