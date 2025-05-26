package com.javaacademy.Ablazzing_insurance_project.service;

import com.javaacademy.Ablazzing_insurance_project.insurance.Contract;
import com.javaacademy.Ablazzing_insurance_project.insurance.Type;

import java.math.BigDecimal;

public interface InsuranceService {

    Contract offer(BigDecimal amountCoverage, String fullName, Type type);

    Contract buy(String numberContract);
}
