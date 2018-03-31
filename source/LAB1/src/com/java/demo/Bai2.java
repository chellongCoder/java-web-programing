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
public class Bai2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap a > ");
        double a = input.nextDouble();
        
        System.out.print("Nhap b > ");
        double b = input.nextDouble();
        
        System.out.print("Nhap c > ");
        double c = input.nextDouble();
        
        double x = (c - b) / a;
        
        System.out.println("Ket qua");
        System.out.println("x = " + x);
    }
    
}
