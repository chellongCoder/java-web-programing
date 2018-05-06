/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

/**
 *
 * @author pc
 */
public class Main {
    public static void main(String[] args) {
        
        Person p = new Person();
        p.setName("MINH");
        
        
        Student s = new Student();
        
        s.setName("HOANG");
        s.setAddress("HA NOI");
        System.out.println(s.getName());
        System.out.println(s.getAddress());
    }
   
}
