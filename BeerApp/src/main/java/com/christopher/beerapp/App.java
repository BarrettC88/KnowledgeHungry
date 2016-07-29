package com.christopher.beerapp;

import com.christopher.beerapp.com.christopher.beerapp.employee.Employee;
import com.christopher.beerapp.com.christopher.beerapp.employee.SalesPerson;

import java.time.LocalDate;
import java.time.Month;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Employee emp = new SalesPerson("Christopher", "Barrett", LocalDate.of(1988, Month.NOVEMBER, 22),
                LocalDate.of(2016, Month.MAY, 01));
        System.out.println(emp.toString());
    }
}
