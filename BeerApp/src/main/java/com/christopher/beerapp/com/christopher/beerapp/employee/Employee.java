package com.christopher.beerapp.com.christopher.beerapp.employee;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by USER on 28-Jul-16.
 */
public abstract class Employee {
    protected String name;
    protected String surname;
    protected LocalDate dateOfBirth;
    protected LocalDate joinDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public abstract void printJobDescription();


    @Override
    public String toString()
    {
        StringBuilder empInformation = new StringBuilder();
        empInformation.append("Employee " + this.name + " " + this.surname + " was born " + this.dateOfBirth +
        " and joined our company " + joinDate);
        return empInformation.toString();
    }


}
