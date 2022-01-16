package com.company;

import org.w3c.dom.Text;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee();
        employee.baseSalary = 200000;
        employee.hourlyRate = 80;
        int wage = employee.calculateWage(10);
    }
}

// Encapsulation: Bundle the data and the methods that operate on the data in a single unit