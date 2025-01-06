package com.amalvadkar.jia.challenges;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CustomerProcessor {

    public static List<Customer> extractCustomers(String customers){
        List<String> customerList = customers.lines()
                .toList();
        List<Customer> finalCustomers = new ArrayList<>();
        for (String customerLine : customerList) {
            String[] customerDetails = customerLine.split("~");
            var customer = new Customer(
                    Long.valueOf(String.valueOf(customerDetails[0])),
                    customerDetails[1],
                    customerDetails[2],
                    customerDetails[3],
                    customerDetails[4],
                    customerDetails[5],
                    LocalDate.parse(customerDetails[6], DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                    new BigDecimal(String.valueOf(customerDetails[7]))
            );
            finalCustomers.add(customer);
        }
        return finalCustomers;
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
