package com.javaacademy.Ablazzing_insurance_project.calc;

import com.javaacademy.Ablazzing_insurance_project.insurance.TypeInsuranceOfCountry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

@Component
@Profile("brazil")
public class InsuranceCalcBrazilService {
    private final static BigDecimal ROBBERY_INCREMENT = valueOf(300);
    private final static BigDecimal MEDICAL_INCREMENT = valueOf(800);
    @Value("${app.robbery-ratio}")
    private static BigDecimal ROBBERY_RATIO;
    @Value("${app.medical-ratio}")
    private static BigDecimal MEDICAL_RATIO;

    public static BigDecimal costContract(BigDecimal amountCoverage, TypeInsuranceOfCountry typeInsurance) {
        if (typeInsurance.getTypeInsurance().equals(TypeInsuranceOfCountry.ROBBERY_INSURANCE_BRAZIL.getTypeInsurance())) {
            return amountCoverage.multiply(ROBBERY_RATIO).add(ROBBERY_INCREMENT);
        } else {
            return amountCoverage.multiply(MEDICAL_RATIO).add(MEDICAL_INCREMENT);
        }
    }
}
