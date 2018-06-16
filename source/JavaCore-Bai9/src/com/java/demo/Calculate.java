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
 
    public double inputNumber(String mes) {
        Scanner input = new Scanner(System.in);
        double num = 0;
        boolean inputNumber = false;
        do {                
            try {
                System.out.print(mes);
                num = Double.parseDouble(input.nextLine());
                inputNumber = false;
            } catch (NumberFormatException e) {
                System.out.println("Phai nhap so.");
                inputNumber = true;
            }    
        } while (inputNumber);
        return num;
    }
    
    public void run() {
        Scanner input = new Scanner(System.in);
        boolean isNext = true;
        boolean inputA = false;
        boolean inputB = false;
        do {
            double a = inputNumber("a = ");
            double b = inputNumber("b = ");
            
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
