package com.javaacademy.Ablazzing_insurance_project.calc;

import com.javaacademy.Ablazzing_insurance_project.insurance.TypeInsuranceOfCountry;

import java.math.BigDecimal;

public interface InsuranceCalcService {

    BigDecimal costContract(BigDecimal amountCoverage, TypeInsuranceOfCountry typeInsurance);
}
