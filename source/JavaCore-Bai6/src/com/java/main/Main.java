/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.main;

import com.java.demo.Person;
import java.util.Scanner;


/**
 *
 * @author pc
 */
public class Main {

    public static Scanner input;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final double PI = 3.14;
        
        System.out.println(Math.PI);
        input.next();
        inMenu();
        
//        Person.id = "234";
        
//        Person p = new Person("HOANG");
//        p.setName("MINH");
//        System.out.println(p.getName());
    }
    
    public static void inMenu() {
        System.out.println("Menu");
    }
    
}
