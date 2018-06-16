/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;



/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Vector<String> v = new Vector<>(); //Generic Class
//        v.addElement("Hello");
//        
//        for (int i = 0; i < v.size(); i++) {
//            System.out.println(v.elementAt(i));
//        }
        
        
//        List<Student> list = new ArrayList<>();
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("hoang", "hoang@mgial.com", 11));
//        list.add(123);
//        list.add(12.333);
//        list.add("Hello");
//        list.add("String");
//        
//        if (list.isEmpty()) {
//            System.out.println("Khong co ptu nao");
//        } else {
//            // duyet list
//            for (int i = 0; i < list.size(); i++) {
//                System.out.println(list.get(i));
//            }
//        }
//        System.out.println("-====================-");
//        list.add(1, 9999);
//        // duyet foreach
//        for (Object item : list) {
//            System.out.println(item);
//        }
//        list.remove(1);
//        boolean contains = list.contains(9999);
//        if (contains) 
//            System.out.println("Phan tu 9999 da duoc them vao ds");
//        else 
//            System.out.println("Khong ton tai");
//        
//        int index = list.indexOf(9999);
//        System.out.println("SO 9999 nam o vi tri " + index);
//        
//        


        LinkedList linkedList = new LinkedList();
        linkedList.addFirst("helllo");
        linkedList.addLast(1234);
        
        
        System.out.println(linkedList.poll());
        System.out.println(linkedList.getFirst());
        

    }
    
}
