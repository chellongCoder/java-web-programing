/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.java;

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
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int a;
        do {
            System.out.println("Nhap 1-10");
            System.out.print("a = ");
            a = input.nextInt();
            if (a > 10 || a < 1)
                System.out.println("Ban nhap sai. Nhap lai.");
        } while(a > 10 || a < 1);
        
        
        System.out.println("a = " + a);
        
        
        
        
        
        
//        int sum = 0;
//        for (int i = 0; i <= a; i+=2) {
////            if (i % 2 == 0) {
//                sum += i;
////                continue;
////            }   
//        }
//        System.out.printf("Tong 1 - %d = %d\n", a, sum);
//        
//        
//        
//        
        // tinh tong 1 - a su dung while
//        int sum = 0;
//        int i = 1;
//        do{
//            sum = sum + i;
//            i++;
//        }while(i <= a);
//        while(i <= a){
//            sum = sum + i;
//            i++;
//        }
//        for (int i = 1; i <= a; i++) {
//            sum = sum + i;
//        }
//        System.out.printf("Tong 1 - %d = %d\n", a, sum);
        
        
        
        
        
        
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < a; j++) {
//                if (i == j)
//                    System.out.print("1 ");
//                else
//                    System.out.print("0 ");
//            }
//            System.out.println(""); //in dau xuong dong
////            System.out.print("\n");
//        }
        
        System.out.println("Ket thuc.");
        
        
    }
    
}
