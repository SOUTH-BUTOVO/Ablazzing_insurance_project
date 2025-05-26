package com.javaacademy.Ablazzing_insurance_project.service;

import com.javaacademy.Ablazzing_insurance_project.calc.InsuranceCalcService;
import com.javaacademy.Ablazzing_insurance_project.repository.Archive;
import com.javaacademy.Ablazzing_insurance_project.repository.GenerateNumber;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("brazil")
public class InsuranceServiceBrazil extends AbstractInsuranceService {
    public InsuranceServiceBrazil(Archive archive, GenerateNumber generateNumber,
                                  InsuranceCalcService insuranceCalcService) {
        super(archive, generateNumber, insuranceCalcService);
    }
}
