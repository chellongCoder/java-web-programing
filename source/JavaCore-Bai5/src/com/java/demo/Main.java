/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.util.StringTokenizer;


/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student s1 = new Student();
        String info = s1.printInfo();
        System.out.println(info);
        System.out.println("------");
        Student s2 = new Student("Tuan Anh");
        s2.setStudentNo("AT0002");
        s2.ganTuoi(11);
        System.out.println(s2.printInfo());
        System.out.println("------");
        Student s3 = new Student("Binh", 18);
        s3.setStudentNo("AT0003");
        System.out.println(s3.printInfo());
        
        
        
        
        
        // StringBUilder
//        StringBuilder builder = new StringBuilder("Java");
//       
//        builder.append(" Core");
//        builder.append(" Lap trinh");
//        
//        builder.insert(4, " Hello");
//        
//        builder.replace(0, 4, "Javascript");
//        
//        builder.delete(4, 10);
//        
//        builder.reverse();
//        
//        System.out.println(builder.toString());
//          StringTokenizer st = 
//                  new StringTokenizer("Hom nay, troi nang qua", ",");
//          
//          System.out.println(st.countTokens());
//          while(st.hasMoreTokens())
//            System.out.println(st.nextToken());







    }
    
}
