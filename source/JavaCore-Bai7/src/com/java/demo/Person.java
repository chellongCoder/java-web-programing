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
public class Person {
 
    private String name;
    private Date birthday;

    public Person() {
    }

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
       
    public void getDetails() {
        System.out.println("Person name: " + this.name);
        System.out.println("Person Birthday: " + this.birthday);
    }
    
}
