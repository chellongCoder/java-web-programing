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
public class Bai4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so a > ");
        double a = input.nextDouble();
        System.out.print("Nhap so b > ");
        double b = input.nextDouble();
//        double temp = a;
//        a = b;
//        b = temp;

        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("Ket qua");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
