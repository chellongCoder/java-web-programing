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
public class Calculate {
 
    public double inputNumber() {
        return 0.0;
    }
    
    public void run() {
        Scanner input = new Scanner(System.in);
        boolean isNext = true;
        boolean inputA = false;
        boolean inputB = false;
        do {
            double a = 0;
            do {                
                try {
                    System.out.print("a = ");
                    a = Double.parseDouble(input.nextLine());
                    inputA = false;
                } catch (NumberFormatException e) {
                    System.out.println("Phai nhap so.");
                    inputA = true;
                }    
            } while (inputA);
            
            double b = 0;
            do {                
                try {
                    System.out.print("b = ");
                    b = Double.parseDouble(input.nextLine());
                    inputB = false;
                } catch (NumberFormatException e) {
                    System.out.println("Phai nhap so.");
                    inputB = true;
                }    
            } while (inputB);
            
            
            System.out.print("(+,-,*,/) = ");
            String opt = input.nextLine();

            switch (opt) {
                case "+":
                    System.out.println(a + " + " + b + " = " + (a+b));
                    break;
                case "-":
                    System.out.println(a + " - " + b + " = " + (a-b));
                    break;
                case "*":
                    System.out.println(a + " * " + b + " = " + (a*b));
                    break;
                case "/":
                    System.out.println(a + " / " + b + " = " + (a/b));
                    break;
                default: 
                    System.out.println("Khong ho tro phep tinh " + opt);
            }
            System.out.print("Co tiep tuc ko? (y/n) ");
            String cont = input.nextLine();
            if (cont.equals("n")) isNext = false;
        } while(isNext);
        
    }
    
    
}
