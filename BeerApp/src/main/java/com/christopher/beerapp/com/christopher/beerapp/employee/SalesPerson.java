package com.christopher.beerapp.com.christopher.beerapp.employee;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by USER on 28-Jul-16.
 */
public class SalesPerson extends Employee {

    public SalesPerson(String name, String surname, LocalDate dateOfBirth, LocalDate joinDate) {
        this.name=name;
        this.surname=surname;
        this.dateOfBirth=dateOfBirth;
        this.joinDate=joinDate;
    }

    public void printJobDescription() {
        System.out.println("This persons job is to sell as much beer to private and institutional clients as possible");
    }
}
