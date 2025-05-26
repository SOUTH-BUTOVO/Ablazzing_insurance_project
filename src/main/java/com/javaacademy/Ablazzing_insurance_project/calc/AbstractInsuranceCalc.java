package com.javaacademy.Ablazzing_insurance_project.calc;

import com.javaacademy.Ablazzing_insurance_project.insurance.Type;
import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;

public abstract class AbstractInsuranceCalc implements InsuranceCalcService {
    @Value("${insurance.medical-ratio}")
    protected BigDecimal medicalRatio;
    @Value("${insurance.medical-increment}")
    protected BigDecimal medicalIncrement;
    @Value("${insurance.robbery-ratio}")
    protected BigDecimal robberyRatio;
    @Value("${insurance.medical-increment}")
    protected BigDecimal robberyIncrement;

    @Override
    public BigDecimal calculate(BigDecimal amountCoverage, Type type) {
        return switch (type) {
            case MEDICAL -> amountCoverage.multiply(medicalRatio).add(medicalIncrement);
            case ROBBERY -> amountCoverage.multiply(robberyRatio).add(robberyIncrement);
        };
    }
}
