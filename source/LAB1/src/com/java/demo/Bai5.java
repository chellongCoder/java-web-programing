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
public class Bai5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so a > ");
        int a = input.nextInt();
        System.out.println("Ket qua");
        
//        int m = a % 2;
        System.out.println( a % 2 == 0 ? 
                "a la so chan" : "a la so le");
    }
}
