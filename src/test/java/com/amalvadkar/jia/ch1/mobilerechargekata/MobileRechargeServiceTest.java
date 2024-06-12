package com.amalvadkar.jia.ch1.mobilerechargekata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MobileRechargeServiceTest {

    @Test
    void recharge_should_do_recharge_and_return_plan_expiry_message() {
        MobileRechargeService mobileRechargeService = new MobileRechargeService();
        String planExpiryMessage = mobileRechargeService.recharge(239);
        assertThat(planExpiryMessage).contains("Plan is valid till ");
    }
}