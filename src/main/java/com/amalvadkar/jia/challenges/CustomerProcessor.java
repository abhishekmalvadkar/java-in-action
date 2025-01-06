package com.amalvadkar.jia.challenges;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class CustomerProcessor {

    public static final String CUSTOMER_DATA_DELIMETER = "~";

    public static List<Customer> extractCustomers(String customers){
        return customers.lines()
                .map(CustomerProcessor::splitWithDelimeter)
                .map(CustomerProcessor::parseCustomer)
                .toList();
    }

    private static String[] splitWithDelimeter(String customerLine) {
        return customerLine.split(CUSTOMER_DATA_DELIMETER);
    }

    private static Customer parseCustomer(String[] customerDetails) {
        return new Customer(
                Long.valueOf(String.valueOf(customerDetails[0])),
                customerDetails[1],
                customerDetails[2],
                customerDetails[3],
                customerDetails[4],
                customerDetails[5],
                LocalDate.parse(customerDetails[6], DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                new BigDecimal(String.valueOf(customerDetails[7]))
        );
    }

}

record Customer(
        Long id,
        String name,
        String mobileNumber,
        String emailId,
        String city,
        String cardNumber,
        LocalDate dob,
        BigDecimal balance
){}
