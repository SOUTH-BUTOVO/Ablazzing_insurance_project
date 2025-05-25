package com.javaacademy.Ablazzing_insurance_project.insurance;

import lombok.Data;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Data
@Component
public class InsuranceContract {
    private final String numContract; // Номер договора
    private final BigDecimal costContract; // Стоимость страховки
    private final BigDecimal amountCoverage; // Сумма покрытия
    @Value("${app.currency}")
    private final String currencyContract; // Валюта договора
    private final String fioClient; // ФИО клиента
    @Value("${app.country}")
    private final String countryAction; // Страна действия
    private final TypeInsuranceOfCountry typeInsurance; // Тип страховки
    @NonNull
    private boolean isPaidContract; // Оплачен ли договор
}
