package com.practicecoding.practicecoding.controllers;

import com.practicecoding.practicecoding.data.CatRepository;
import com.practicecoding.practicecoding.data.DogData;
import com.practicecoding.practicecoding.models.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class CatController {

    //Autowired sets up Repository inside of conrtoller
    @Autowired
    private CatRepository catRepository;

    @GetMapping("cat/create")
    public String createCatPage(Model model) {
        model.addAttribute("cats", this.catRepository.findAll());
        return "cat";
    }

    @PostMapping("cat/create")
    public String createACat(@ModelAttribute @Valid Cat myCat, Error errors) {
        //if (errors.hasErrors()) is correct but throws an error needs fixing
        if (errors.equals(true)) {
            return "cat";
        }
//        DogData.getMyDogs().add(myDog);
        catRepository.save(myCat);
        return "index";

    }


    //"cats parameter creates the route for the view
    @GetMapping("cats")
    public String showMyCatsHomepage(Model model) {
        //Create a list using Arraylist
        ArrayList<String> favoriteCats = new ArrayList<>();
        favoriteCats.add("Calico");
        favoriteCats.add("Simese");
        favoriteCats.add("Persian");
//injects list inside of index.html template using (Model model) param and model.addAttribute
        // add <link th:href="@{styles.css}" rel="stylesheet"/> to index.html
        //to connect styles.css to index.html
        model.addAttribute("cats", favoriteCats);
        model.addAttribute("dogs", DogData.getMyDogs());
        return "index";
    }

    //PostMapping accepts data after button click
    @PostMapping("show-cats")
    public String showSomeCats() {

        return "index";
    }
}
