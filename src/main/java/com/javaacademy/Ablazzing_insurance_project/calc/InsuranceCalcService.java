package com.javaacademy.Ablazzing_insurance_project.calc;

import com.javaacademy.Ablazzing_insurance_project.insurance.Type;

import java.math.BigDecimal;

public interface InsuranceCalcService {

    BigDecimal calculate(BigDecimal amountCoverage, Type type);
}
