package com.javaacademy.Ablazzing_insurance_project.repository;

import org.springframework.stereotype.Component;

@Component
public class GenerateNumber {
    private int number = 0;

    public String generate() {
        number++;
        return "WORLD-%03d".formatted(number);
    }
}
