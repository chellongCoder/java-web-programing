/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.util.Date;

/**
 *
 * @author pc
 */
public class Employee extends Person {
 
    private double salary;
    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    
    public Employee(String name, Date birthday) {
        super(name, birthday);
    }
    
    @Override
    public void getDetails() {
        super.getDetails(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Salary: " + this.salary);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
