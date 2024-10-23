package com.example.quiz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.quiz.models.CoffeShop;
import com.example.quiz.services.CoffeShopService;
@Controller
public class CoffeShopController {

    @Autowired
    CoffeShopService coffeShopService;

    @GetMapping("/coffe-shop")
    public String listCoffeShop(Model model) {
        List<CoffeShop> coffeShops = coffeShopService.getAllCoffe();
        model.addAttribute("coffeShop", coffeShops);
        return "coffe-shop";
    }
}
