package com.amalvadkar.jia.ch1.mobilerechargekata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class MobileRechargeService {

    public static final DateTimeFormatter PLAN_EXPIRY_DATE_FORMATTER = DateTimeFormatter.ofPattern("dd MMM yyyy");
    private static final Logger log = LoggerFactory.getLogger(MobileRechargeService.class);

    public String recharge(Integer planAmount){
        Integer validityDays = PlanUtils.getValidityDays(planAmount);
        LocalDate todayDate = LocalDate.now();
        LocalDate planExpiryDate = todayDate.plusDays(validityDays);
        String planExpiryMsg = String.format("Plan is valid till %s",
                planExpiryDate.format(PLAN_EXPIRY_DATE_FORMATTER));
        log.info("Recharge proceed successfully and {}", planExpiryMsg);
        return planExpiryMsg;
    }

}
