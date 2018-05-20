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
public class Paper extends Document {
    
    private String journal;
    private String year;

    public Paper() {
    }

    public Paper(String journal, String year, String id, String title, String author, int count) {
        super(id, title, author, count);
        this.journal = journal;
        this.year = year;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
//        System.out.println(super.toString());
        return super.toString() + ", Paper{" + "journal=" + journal + ", year=" + year + '}';
    }
    
    @Override
    public void input() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.print("Journal ");
        setJournal(input.nextLine());
        
        System.out.print("Year ");
        setYear(input.nextLine());
    }
    
}
