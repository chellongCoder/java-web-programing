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
public class Document {
    
    private String id;
    private String title;
    private String author;
    private int count;
//    protected Scanner input;

    public Document() {
    }

    public Document(String id, String title, String author, int count) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Document{" + "id=" + id + ", title=" + title + ", author=" + author + ", count=" + count + '}';
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Id: ");
        setId(input.nextLine());
        System.out.print("Title: ");
        setTitle(input.nextLine());
        System.out.print("Author: ");
        setAuthor(input.nextLine());
        System.out.print("Count: ");
        setCount(Integer.parseInt(input.nextLine()));
    }
    
    public void display() {
        //------TODO--------
    }
    
    
}
