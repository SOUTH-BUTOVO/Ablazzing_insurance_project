package com.javaacademy.Ablazzing_insurance_project.insurance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

import static com.javaacademy.Ablazzing_insurance_project.insurance.Status.*;

@Getter
@ToString
@AllArgsConstructor
public class Contract {
    private String number; // Номер договора
    private BigDecimal price; // Стоимость страховки
    private BigDecimal coverage; // Сумма покрытия
    private String currency; // Валюта договора
    private String fullName; // ФИО клиента
    private String country; // Страна действия
    private Type type; // Тип страховки
    @Setter
    private Status status = UNPAID; // Оплачен ли договор
}
