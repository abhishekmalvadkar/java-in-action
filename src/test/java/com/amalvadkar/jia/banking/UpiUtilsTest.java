package com.amalvadkar.jia.banking;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UpiUtilsTest {

    @Test
    void isValidUpiId() {
        assertThat(UpiUtils.isValidUpiId("1234567890@paytm")).
        isTrue();
        assertThat(UpiUtils.isValidUpiId("businessname@icici")).
                isTrue();
        assertThat(UpiUtils.isValidUpiId("john123@up")).
                isFalse();
        assertThat(UpiUtils.isValidUpiId("@upi")).
                isFalse();
        assertThat(UpiUtils.isValidUpiId("john123upi")).
                isFalse();
    }

    @Test
    void findInvalidUpiIdReason() {
        assertThat(UpiUtils.findInvalidUpiIdReason("@paytm")).
                isEqualTo("missing username");
        assertThat(UpiUtils.findInvalidUpiIdReason("john123paytm")).
                isEqualTo("missing @ symbol");
        assertThat(UpiUtils.findInvalidUpiIdReason("john123@xyz")).
                isEqualTo("invalid upi provider");
        assertThat(UpiUtils.findInvalidUpiIdReason("john123@")).
                isEqualTo("missing upi provider");
        assertThat(UpiUtils.findInvalidUpiIdReason("john123@  ")).
                isEqualTo("missing upi provider");
        assertThat(UpiUtils.findInvalidUpiIdReason(null)).
                isEqualTo("missing upiId");
        assertThat(UpiUtils.findInvalidUpiIdReason("1234567890@paytm")).
                isEmpty();
    }
}