package com.example.quiz.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.quiz.models.Barista;

@Service
public class BaristaService {
    public List<Barista> getAllBarista(){
        List<Barista> baristas = new ArrayList<>();
        baristas.add(new Barista(1,"Arya","Sumatra"));
        baristas.add(new Barista(2,"Fadly","Bogor"));
        baristas.add(new Barista(3,"Anisa","Batam"));
        baristas.add(new Barista(4,"Ades","Banjar"));

        return baristas;
    }
}

