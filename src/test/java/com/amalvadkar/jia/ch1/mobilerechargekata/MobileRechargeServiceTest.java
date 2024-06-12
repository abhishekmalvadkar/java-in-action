package com.amalvadkar.jia.ch1.mobilerechargekata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MobileRechargeServiceTest {

    @Test
    void recharge_should_do_recharge_and_return_plan_expiry_message() {
        MobileRechargeService mobileRechargeService = new MobileRechargeService();
        int planAmount = 239;
        String planExpiryMessage = mobileRechargeService.recharge(planAmount);
        assertThat(planExpiryMessage).contains("Plan is valid till ");
    }

    @Test
    void should_throw_exception_if_passed_invalid_plan_amount() {
        MobileRechargeService mobileRechargeService = new MobileRechargeService();
        assertThatThrownBy(() -> {
            int planAmount = 10;
            mobileRechargeService.recharge(planAmount);
        })
                .isInstanceOf(InvalidPlanAmountException.class)
                .hasMessage("Invalid plan amount");
    }
}