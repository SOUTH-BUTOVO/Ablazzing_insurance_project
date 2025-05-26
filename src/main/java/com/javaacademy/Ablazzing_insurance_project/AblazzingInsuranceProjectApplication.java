package com.javaacademy.Ablazzing_insurance_project;

import com.javaacademy.Ablazzing_insurance_project.insurance.Contract;
import com.javaacademy.Ablazzing_insurance_project.insurance.Type;
import com.javaacademy.Ablazzing_insurance_project.service.InsuranceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class AblazzingInsuranceProjectApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(
                AblazzingInsuranceProjectApplication.class, args);
        InsuranceService insuranceService = context.getBean(InsuranceService.class);
        Contract offer = insuranceService.offer(BigDecimal.valueOf(10_000), "Sergey S.E.", Type.ROBBERY);
        System.out.println(offer);
        Contract buy = insuranceService.buy(offer.getNumber());
        System.out.println(buy);
    }
}
