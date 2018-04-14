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
        Scanner input = new Scanner(System.in);
//        int[] studentScores = {1,2,3,4,5,6};
        int[] studentScores = new int[5];
        
        for (int i = 0; i < studentScores.length; i++) {
            System.out.printf("Phan tu %d: ", i);
            studentScores[i] = input.nextInt();
        }
        
        int sum = 0;
        for (int item : studentScores) {
            sum += item;
            System.out.print(item + " ");
        }
//        for (int i = 0; i < studentScores.length; i++) {
//            sum += studentScores[i];
//            System.out.print(studentScores[i] + " ");    
//        }
        System.out.println("\nTong: " + sum);
        
        // Tim cac so chan trong mang
        System.out.println("Phan tu chan");
        for (int i = 0; i < studentScores.length; i++ ) {
            if (studentScores[i] % 2 == 0)
                System.out.print(studentScores[i] + " ");
        }
        
        
    }
    
}
