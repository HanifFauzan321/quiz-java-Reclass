package com.example.quiz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.quiz.models.Coffe;
import com.example.quiz.services.CoffeService;

@Controller
public class CoffeController {
    @Autowired
    CoffeService coffeService;



    @GetMapping("/list-coffe")
    public String listCoffe(Model model) {
        List<Coffe> coffes = coffeService.getAllCoffe();
        model.addAttribute("coffes", coffes);
        return "coffe";
    }




}
