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
public class Book extends Document{
    
    private String publisher;
    private String version;
    private String year;

    public Book() {
    }

    public Book(String publisher, String version, String year, String id, String title, String author, int count) {
        super(id, title, author, count);
        this.publisher = publisher;
        this.version = version;
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        
        return super.toString()+ ", Book{" + "publisher=" + publisher + ", version=" + version + ", year=" + year + '}';
    }

    @Override
    public void input() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.print("Publisher ");
        setPublisher(input.nextLine());
        System.out.print("Version ");
        setVersion(input.nextLine());
        System.out.print("Year ");
        setYear(input.nextLine());
    }
    
    
    
    
}
