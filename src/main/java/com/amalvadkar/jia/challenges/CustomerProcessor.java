package com.amalvadkar.jia.challenges;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class CustomerProcessor {

    public static List<Customer> extractCustomers(String customers){
        return customers.lines().map((value) -> value.split("~"))
                .map(customerDetails ->
                        new Customer(
                                Long.valueOf(customerDetails[0]),
                                customerDetails[1],
                                customerDetails[2],
                                customerDetails[3],
                                customerDetails[4],
                                customerDetails[5],
                                LocalDate.parse(customerDetails[6],DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                                new BigDecimal(customerDetails[7])

                        )).toList();
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
