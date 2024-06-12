package com.amalvadkar.jia.ch1.mobilerechargekata;

import java.util.Map;

import static java.util.Objects.isNull;

public class PlanUtils {

    private static final Map<Integer, Integer> PLAN_AMOUNT_TO_VALIDITY_DAYS_MAP;

    static {
        PLAN_AMOUNT_TO_VALIDITY_DAYS_MAP = Map.ofEntries(
               Map.entry(239, 28),
               Map.entry(666, 84),
               Map.entry(278, 24),
               Map.entry(250, 30),
               Map.entry(155, 24),
               Map.entry(49, 15)
        );
    }

    static Integer getValidityDays(Integer planAmount) {
        Integer validityDays = PLAN_AMOUNT_TO_VALIDITY_DAYS_MAP.get(planAmount);
        boolean inputPlanAmountIsInvalid = isNull(validityDays);
        if (inputPlanAmountIsInvalid){
            throw new InvalidPlanAmountException("Invalid plan amount");
        }
        return validityDays;
    }
}
