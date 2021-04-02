package com.practicecoding.practicecoding.controllers;

import com.practicecoding.practicecoding.data.DogData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class CatController {
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
    @PostMapping("cats")
    public String showSomeCats() {

        return "index";
    }
}
