package com.javaacademy.Ablazzing_insurance_project.repository;

import com.javaacademy.Ablazzing_insurance_project.insurance.Contract;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class Archive {
    public Map<String, Contract> contracts = new HashMap<>();

    public void save(Contract contract) {
        if (contracts.containsKey(contract.getNumber())) {
            throw new RuntimeException("Договор с таким номером уже существует.");
        }
        contracts.put(contract.getNumber(), contract);
    }

    public Optional<Contract> getByNumber(String number) {
        return Optional.ofNullable(contracts.get(number));
    }
}
