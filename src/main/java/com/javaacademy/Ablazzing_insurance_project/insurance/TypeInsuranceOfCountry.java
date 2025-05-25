package com.javaacademy.Ablazzing_insurance_project.insurance;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public enum TypeInsuranceOfCountry {

//    BRAZIL("Brazil", "real"),
//    JAPAN("Japan", "yen"),

//    MEDICAL_INSURANCE_BRAZIL("Медицинское страхование", BigDecimal.valueOf(0.03)),
//    ROBBERY_INSURANCE_BRAZIL("Защита от грабежа", BigDecimal.valueOf(0.05)),
//    MEDICAL_INSURANCE_JAPAN("Медицинское страхование", BigDecimal.valueOf(0.015)),
//    ROBBERY_INSURANCE_JAPAN("Защита от грабежа", BigDecimal.valueOf(0.01));

    MEDICAL_INSURANCE_BRAZIL("Медицинское страхование"),
    ROBBERY_INSURANCE_BRAZIL("Защита от грабежа"),
    MEDICAL_INSURANCE_JAPAN("Медицинское страхование"),
    ROBBERY_INSURANCE_JAPAN("Защита от грабежа");

    //private String country; // Страна действия
    //private String currency; // Валюта договора

    private String typeInsurance; // Тип страховки
//    private BigDecimal coefficient; // Коэффициент страховки


//    TypeInsuranceOfCountry(String country, String currency) {
//        this.country = country;
//        this.currency = currency;
//    }
//
//    TypeInsuranceOfCountry(String typeInsurance, BigDecimal coefficient) {
//        this.typeInsurance = typeInsurance;
//        this.coefficient = coefficient;
//    }
}
