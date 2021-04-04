package com.practicecoding.practicecoding.controllers;

import com.practicecoding.practicecoding.data.DogData;
import com.practicecoding.practicecoding.data.DogRepository;
import com.practicecoding.practicecoding.models.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class DogController {

    //Autowired sets up Repository inside of conrtoller
    @Autowired
    private DogRepository dogRepository;

    @GetMapping("dog/create")
    public String createDogPage(Model model) {
        model.addAttribute("dogs", this.dogRepository.findAll());
        return "dog";
    }

    @PostMapping("dog/create")
    public String createADog(@ModelAttribute @Valid Dog myDog, Error errors) {
        //if (errors.hasErrors()) is correct but throws an error needs fixing
        if (errors.equals(true)) {
            return "dog";
        }
//        DogData.getMyDogs().add(myDog);
        dogRepository.save(myDog);
        return "index";

    }

    @GetMapping("dogs")
    public String showMyDogs(Model model) {
        model.addAttribute("dogs", this.dogRepository.findAll());
        //model.addAttribute("dogs", DogData.getMyDogs());
        return "show-dogs";
    }
}


