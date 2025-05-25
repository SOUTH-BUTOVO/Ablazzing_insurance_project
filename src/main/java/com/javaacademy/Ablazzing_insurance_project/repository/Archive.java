package com.javaacademy.Ablazzing_insurance_project.repository;

import com.javaacademy.Ablazzing_insurance_project.insurance.InsuranceContract;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Archive {
    public Map<String, InsuranceContract> contracts = new HashMap<>();
}
