package com.javaacademy.Ablazzing_insurance_project.service;

import com.javaacademy.Ablazzing_insurance_project.insurance.InsuranceContract;
import com.javaacademy.Ablazzing_insurance_project.insurance.TypeInsuranceOfCountry;

import java.math.BigDecimal;

public interface InsuranceService {

    InsuranceContract insuranceOffers(
            BigDecimal amountCoverage, String fioClient, TypeInsuranceOfCountry typeInsurance);

    InsuranceContract buyInsurance(InsuranceContract numberContract);
}
