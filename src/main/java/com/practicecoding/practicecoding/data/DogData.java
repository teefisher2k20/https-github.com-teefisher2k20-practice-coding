package com.practicecoding.practicecoding.data;

import com.practicecoding.practicecoding.models.Dog;

import java.util.ArrayList;

public class DogData {

    private static ArrayList<Dog> myDogs = new ArrayList<>();

    public static ArrayList<Dog> getMyDogs() {
        return myDogs;
    }

    public static void setMyDogs(ArrayList<Dog> myDogs) {
        DogData.myDogs = myDogs;
    }
}
