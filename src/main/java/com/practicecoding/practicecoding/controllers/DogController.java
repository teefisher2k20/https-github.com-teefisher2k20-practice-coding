package com.practicecoding.practicecoding.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DogController {

    //    @GetMapping("dog/{name}")
//    @ResponseBody
//    public String bark(@PathVariable String name) {
//        return name + "bark";
//    }
//    @GetMapping("dog")
//    @ResponseBody
//    public String barkWithParams(@RequestParam String name, @RequestParam int age) {
//        return name + "bark and is " + age + "years old";
//    }
    @GetMapping("dog")
    @ResponseBody
    public String barkWithNoName() {
        return "<html><body>" +
                "<h2>My Dog Page</h2>" +
                "<form action='add' method='post'>" +
                "<input type='text' name='dogName' />" +
                "<input type= 'submit' value='Add!'/>" +
                "<form/>" +
                "</body></html>";
    }

    @PostMapping("add")
    @ResponseBody
    public String addTheDog(@RequestParam String dogName) {
        return "<html><body><h2>" +
                dogName + " was added!</h2></body></html>";
    }


}


