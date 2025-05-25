package com.javaacademy.Ablazzing_insurance_project.service;

import com.javaacademy.Ablazzing_insurance_project.calc.InsuranceCalcJapanService;
import com.javaacademy.Ablazzing_insurance_project.insurance.InsuranceContract;
import com.javaacademy.Ablazzing_insurance_project.insurance.TypeInsuranceOfCountry;
import com.javaacademy.Ablazzing_insurance_project.repository.Archive;
import com.javaacademy.Ablazzing_insurance_project.repository.GenerateNumbersContracts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Profile("brazil")
public class InsuranceServiceBrazil extends AbstractInsuranceService {
    Archive archive;
    @Value("${app.country}")
    String country;
    @Value("${app.currency}")
    String currency;
    GenerateNumbersContracts generateNumbersContracts;
    InsuranceCalcJapanService insuranceCalcBrazilService;

    @Override
    public InsuranceContract insuranceOffers(
            BigDecimal amountCoverage, String fioClient, TypeInsuranceOfCountry typeInsurance) {
        String numContract = generateNumbersContracts.newNumContract();
        BigDecimal costContract = insuranceCalcBrazilService.costContract(amountCoverage, typeInsurance);

        InsuranceContract contract = new InsuranceContract(
                numContract,
                costContract,
                amountCoverage,
                currency,
                fioClient,
                country,
                typeInsurance,
                false);
        archive.contracts.put(numContract, contract);
        return contract;
    }

    @Override
    public InsuranceContract buyInsurance(InsuranceContract numberContract) {
        if (!archive.contracts.containsKey(numberContract.getNumContract())) {
            throw new RuntimeException("Такого договора не существует.");
        }
        archive.contracts.get(numberContract.getNumContract()).setPaidContract(true);
        return archive.contracts.get(numberContract.getNumContract());
    }
}
