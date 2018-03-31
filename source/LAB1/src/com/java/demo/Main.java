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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so > ");
        double num = input.nextDouble();
        System.out.println("Ket qua");
        System.out.printf("%.1f^2=%.1f\n", 
                         num, num*num);
//        System.out.printf("%.1f^2=%.1f\n", 
//                num, Math.pow(num, 2));
    }
    
}
