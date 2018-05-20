/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.lab8;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Thesis extends Document{
    
    private String school;
    private String faculity;
    private String year;

    public Thesis() {
    }

    public Thesis(String school, String faculity, String year, String id, String title, String author, int count) {
        super(id, title, author, count);
        this.school = school;
        this.faculity = faculity;
        this.year = year;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getFaculity() {
        return faculity;
    }

    public void setFaculity(String faculity) {
        this.faculity = faculity;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        
        return super.toString() + ",Thesis{" + "school=" + school + ", faculity=" + faculity + ", year=" + year + '}';
    }
    
      @Override
    public void input() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.print("School ");
        setSchool(input.nextLine());
        
        System.out.print("Faculity ");
        setFaculity(input.nextLine());
        
        System.out.print("Year ");
        setYear(input.nextLine());
    }
    
}
