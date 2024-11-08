package com.amalvadkar.jia.challenges;

import java.time.LocalDate;
import java.time.Period;

/*
    We need to deal with age and birthdate
    age -> store or compute ?
 */

class EmployeeEntity{
    public static final String AGE_FORMAT = "%d years %d months %d days";
    private Long id;
    private LocalDate birthDate;

    // giving for testing
    public EmployeeEntity(Long id, LocalDate birthDate) {
        this.id = id;
        this.birthDate = birthDate;
    }

    /*
            if I store this in table then every time as day passed, it has to be changed,
            so I need to think about that as well as cron job or something so it looks verbose
            to me so that's why compute is the best way here, but we will have less performance
            compare to store and retrieve,

            this property will have @Trsnasiet so will not take part in anything related to
            db operations

            we will provide only getter for this but not setter
         */
    private int age;

    // give getAge() name because caller will assume it's normal method, otherwise I give age() only because get is noise
    public String getAge() {
        // we will compute and then return but caller will assume that we have stored
        Period agePeriod = Period.between(birthDate, LocalDate.now());
        int ageYear = agePeriod.getYears();
        int ageMonth = agePeriod.getMonths();
        int ageDays = agePeriod.getDays();
        return String.format(AGE_FORMAT,ageYear, ageMonth, ageDays);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
public class BirthdayAgeKata {

//    public static void main(String[] args) {
////        System.out.println(Period.between(LocalDate.of(1995, 4, 24), LocalDate.now())); // Period toString is very interesting - P29Y6M15D
//    }

    public static String provideAge(EmployeeEntity employeeEntity){
        return employeeEntity.getAge();
    }
}
