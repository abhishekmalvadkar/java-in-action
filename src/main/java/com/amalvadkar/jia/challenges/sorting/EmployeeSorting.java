package com.amalvadkar.jia.challenges.sorting;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

/*
    Requirement: You are building an HR application.
    You have a list of employees with their names, age, and salary.

    Employees: [
      {"name": "Alice", "age": 30, "salary": 70000},
      {"name": "Bob", "age": 25, "salary": 80000},
      {"name": "Charlie", "age": 25, "salary": 60000}
    ]

    Task:
    Sort employees by:
    Age (ascending),
    Salary (descending), and
    Name (alphabetical order) if age and salary are the same.

    The goal is to sort the employees based on multiple criteria:

    Primary Criterion: Age in ascending order (younger employees come first).
    Secondary Criterion: Salary in descending order (higher-paid employees come first for the same age).
    Tertiary Criterion: Name in alphabetical order (if both age and salary are the same).
 */
public class EmployeeSorting {

    public static List<Employee> sort(List<Employee> employeeList){
        return employeeList.stream()
                .sorted(
                        Comparator.comparing(Employee::age)
                                .thenComparing(Comparator.comparing(Employee::salary).reversed())
                                .thenComparing(Employee::name)
                )
                .toList();
    }

}

record Employee(String name , int age , BigDecimal salary){}
