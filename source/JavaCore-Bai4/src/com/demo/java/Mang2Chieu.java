/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Mang2Chieu {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[][] matrix = { {1,2,3},{3,4,5},{6,7,8} };
        int[][] matrix = new int[6][5];
//        matrix[0][0] = 34;
        
//        System.out.println("Phan tu (0,0): " + matrix[0][0]);
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.printf("Nhap (%d,%d): ",i,j);
//                matrix[i][j] = input.nextInt();
//            }
//        }
        
        Random rd = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.abs(rd.nextInt() % 90) + 10;
            }
         
        }
        
        System.out.println("------------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
    
}
