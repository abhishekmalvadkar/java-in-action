package com.amalvadkar.jia.ch1.mobilerechargekata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;


public class MobileRechargeService {

    private static final Logger log = LoggerFactory.getLogger(MobileRechargeService.class);

    public String recharge(Integer rechargeAmount){
        Map<Integer, Integer> priceToValidityDaysMap = Map.of(239, 28);
        LocalDate todayDate = LocalDate.now();
        Integer validityDays = priceToValidityDaysMap.get(rechargeAmount);
        LocalDate planExpiryDate = todayDate.plusDays(validityDays);
        DateTimeFormatter planExpiryDateFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String planExpiryMsg = String.format("Plan is valid till %s",
                planExpiryDate.format(planExpiryDateFormatter));
        log.info("Recharge proceed successfully and {}", planExpiryMsg);
        return planExpiryMsg;
    }

}
