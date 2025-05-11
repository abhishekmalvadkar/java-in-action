package com.amalvadkar.jia.telecommunication;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class RechargeUtilsTest {

    @Test
    @DisplayName("It should return false if mobile number is invalid")
    void should_return_false_mobile_no_invalid() {
        assertThat(RechargeUtils.isValidPhoneNumber("1234")).isFalse();
        assertThat(RechargeUtils.isValidPhoneNumber("6908675679")).isTrue();
        assertThat(RechargeUtils.isValidPhoneNumber("1908675679")).isFalse();
    }

    @Test
    @DisplayName("It should return false if mobile number is invalid")
    void should_validate_the_recharge_amount() {
       boolean isValidRechargeAmount = RechargeUtils.isValidRechargeAmount(new BigDecimal(8));
        assertThat(isValidRechargeAmount).isFalse();
        assertThat(RechargeUtils.isValidRechargeAmount(new BigDecimal(4000))).isTrue();
        assertThat(RechargeUtils.isValidRechargeAmount(new BigDecimal(5000))).isTrue();
        assertThat(RechargeUtils.isValidRechargeAmount(new BigDecimal(50000))).isFalse();
    }

    @Test
    void should_recharge() {

        assertThat(RechargeUtils.recharge("6756453423 500 Jio")).isEqualTo("recharge successfully");
        assertThat(RechargeUtils.recharge("6756453423 Jio")).isEqualTo("mobile number or amount or provider should not me missing");
       // assertThat(RechargeUtils.recharge("6756453423  Jio")).isEqualTo("amount not should be between 10 - 5000");
    }




}