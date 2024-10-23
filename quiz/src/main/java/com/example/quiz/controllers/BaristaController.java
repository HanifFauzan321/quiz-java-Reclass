package com.example.quiz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.quiz.models.Barista;
import com.example.quiz.services.BaristaService;

@Controller
public class BaristaController {

    @Autowired
    BaristaService baristaService;

    @GetMapping("/list-barista")
    public String listBarista(Model model) {
        List<Barista> baristas = baristaService.getAllBarista();
        model.addAttribute("baristas", baristas);
        return "barista";
    }
}
