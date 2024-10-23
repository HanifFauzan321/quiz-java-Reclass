package com.example.quiz.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.quiz.models.Coffe;

@Service
public class CoffeService {
    public List<Coffe> getAllCoffe(){
        List<Coffe> coffes = new ArrayList<>();
        coffes.add(new Coffe(1,"Arabika",23000L,"Sedang"));
        coffes.add(new Coffe(2,"Espresso",19000L,"Besar"));
        coffes.add(new Coffe(3,"Americano",25000L,"Kecil"));
        coffes.add(new Coffe(4,"Macchiato",24000L,"Sedang"));

        return coffes;
    }
}
