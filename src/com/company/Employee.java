package com.company;

public class Employee {
    public int baseSalary;
    public int hourlyRate;


    public int calculateWage(int extraHours){ // we dont have to add parameters because we can just use the variables above
        return baseSalary + (hourlyRate*extraHours);
    }
}
