/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Bai3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so a > ");
        int a = input.nextInt();
        
        System.out.print("Nhap so b > ");
        int b = input.nextInt();
        
        System.out.println("Ket qua");
//        String kq = a > b ? "a > b" : "a < b";
        System.out.println(a > b ? "a > b" : 
                (a < b ? "a < b" : "a = b"));
    }
}
