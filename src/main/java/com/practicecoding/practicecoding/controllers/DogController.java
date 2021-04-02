package com.practicecoding.practicecoding.controllers;

import com.practicecoding.practicecoding.data.DogData;
import com.practicecoding.practicecoding.models.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class DogController {

    @GetMapping("dog/create")
    public String createDogPage() {
        return "dog";
    }

    @PostMapping("dog/create")
    public String createADog(@ModelAttribute Dog myDog) {
        DogData.getMyDogs().add(myDog);
        return "redirect:/show";

    }

    @GetMapping("show")
    public String showMyDogs(Model model) {
        model.addAttribute("dogs", DogData.getMyDogs());
        return "show-dogs";
    }
}


