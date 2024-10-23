package com.example.quiz.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Coffe {
    private Integer id;
    private String name;
    private Long price;
    private String size;
}
