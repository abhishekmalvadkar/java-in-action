package com.amalvadkar.jia.ch1;

import java.time.LocalDate;
import java.time.Period;

/*
    We have employee profile page in HRMS system where we are displaying
    Birth Date : 12/12/1995
    Age : 24 years 6 months 26 days
    So what we will do with age value, do we store it, or we will compute and return
    we will compute and return but caller should seems like we are storing
 */
class EmployeeEntity
{
    private Long id;
    private String name;
    private LocalDate birthDate;

    // @Transient
    private String age;

    public EmployeeEntity(Long id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getAge(){
        Period agePeriod = Period.between(birthDate, LocalDate.now());
        System.out.println(agePeriod); // P24Y6M26D
        int ageYear = agePeriod.getYears();
        int ageMonths = agePeriod.getMonths();
        int ageDays = agePeriod.getDays();
        return String.format("%d years %d months %d days", ageYear, ageMonths, ageDays);
    }
}
public class BirthdayAgeRevisited {

    public static  String provideAge(EmployeeEntity employeeEntity){
        return employeeEntity.getAge();
    }

}
