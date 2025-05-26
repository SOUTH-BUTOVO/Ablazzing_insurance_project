package com.javaacademy.Ablazzing_insurance_project.service;

import com.javaacademy.Ablazzing_insurance_project.calc.InsuranceCalcService;
import com.javaacademy.Ablazzing_insurance_project.insurance.Contract;
import com.javaacademy.Ablazzing_insurance_project.insurance.Type;
import com.javaacademy.Ablazzing_insurance_project.repository.Archive;
import com.javaacademy.Ablazzing_insurance_project.repository.GenerateNumber;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;

import static com.javaacademy.Ablazzing_insurance_project.insurance.Status.PAID;
import static com.javaacademy.Ablazzing_insurance_project.insurance.Status.UNPAID;

@RequiredArgsConstructor
public abstract class AbstractInsuranceService implements InsuranceService {
    @Value("${insurance.country}")
    private String country;
    @Value("${insurance.currency}")
    private String currency;
    private final Archive archive;
    private final GenerateNumber generateNumber;
    private final InsuranceCalcService insuranceCalcService;

    @Override
    public Contract offer(BigDecimal amountCoverage, String fullName, Type type) {
        String numContract = generateNumber.generate();
        BigDecimal price = insuranceCalcService.calculate(amountCoverage, type);

        Contract contract = new Contract(
                numContract,
                price,
                amountCoverage,
                currency,
                fullName,
                country,
                type,
                UNPAID);
        archive.save(contract);
        return contract;
    }

    @Override
    public Contract buy(String number) {
        Contract contract = archive.getByNumber(number).orElseThrow();
        contract.setStatus(PAID);
        return contract;
    }
}
