package com.example.quiz.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quiz.models.Barista;
import com.example.quiz.models.Coffe;
import com.example.quiz.models.CoffeShop;



@Service
public class CoffeShopService {

    @Autowired
    CoffeService coffeService;

    @Autowired
    BaristaService baristaService;

    public List<CoffeShop> getAllCoffe(){
        List<CoffeShop> coffeShops = new ArrayList<>();
        List<Coffe> coffes = coffeService.getAllCoffe();
        List<Barista> baristas = baristaService.getAllBarista();

        coffeShops.add(new CoffeShop(coffes.get(0), baristas.get(0)));
        coffeShops.add(new CoffeShop(coffes.get(2),baristas.get(2)));
        coffeShops.add(new CoffeShop(coffes.get(1),baristas.get(1)));
        coffeShops.add(new CoffeShop(coffes.get(3),baristas.get(3)));

        return coffeShops;
    }
}
