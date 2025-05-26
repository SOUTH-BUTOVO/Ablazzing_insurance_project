package com.javaacademy.Ablazzing_insurance_project.calc;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("japan")
public class InsuranceCalcJapanService extends AbstractInsuranceCalc {
}
