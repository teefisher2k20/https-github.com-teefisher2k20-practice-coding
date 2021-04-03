package com.practicecoding.practicecoding.controllers;

import com.practicecoding.practicecoding.data.DogData;
import com.practicecoding.practicecoding.models.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class DogController {

    @GetMapping("dog/create")
    public String createDogPage(Model model) {
        model.addAttribute("dog", new Dog());
        return "dog";
    }

    @PostMapping("dog/create")
    public String createADog(@ModelAttribute @Valid Dog myDog, Error errors) {
        //if (errors.hasErrors()) is correct but throws an error needs fixing
        if (errors.equals(true)) {
            return "dog";
        }
        DogData.getMyDogs().add(myDog);
        return "show-one-dog";

    }

    @GetMapping("show")
    public String showMyDogs(Model model) {
        model.addAttribute("dogs", DogData.getMyDogs());
        return "show-dogs";
    }
}


