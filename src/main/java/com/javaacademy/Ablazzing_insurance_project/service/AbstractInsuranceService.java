package com.javaacademy.Ablazzing_insurance_project.service;

import com.javaacademy.Ablazzing_insurance_project.insurance.InsuranceContract;
import com.javaacademy.Ablazzing_insurance_project.insurance.TypeInsuranceOfCountry;
import com.javaacademy.Ablazzing_insurance_project.repository.Archive;

import java.math.BigDecimal;

public abstract class AbstractInsuranceService implements InsuranceService {
    Archive archive;

    @Override
    public abstract InsuranceContract insuranceOffers(
            BigDecimal amountCoverage, String fioClient, TypeInsuranceOfCountry typeInsurance);

    @Override
    public abstract InsuranceContract buyInsurance(InsuranceContract numberContract);
}
