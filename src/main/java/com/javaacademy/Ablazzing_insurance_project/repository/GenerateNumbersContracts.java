package com.javaacademy.Ablazzing_insurance_project.repository;

import java.util.Random;

public class GenerateNumbersContracts {
    Random random = new Random(1);
    private final static int MIN_NUMBER_CONTRACT = 1;
    private final static int MAX_NUMBER_CONTRACT = 1_000;

    public String newNumContract() {
        int number = random.nextInt(MIN_NUMBER_CONTRACT, MAX_NUMBER_CONTRACT);
        return "WORLD-%03d".formatted(number);
    }
}
