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
public class Matrix {
    private int row;
    private int col;
    private int[][] values;
    public Matrix() {
        this.row = 0;
        this.col = 0;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhap: ");
                this.values[i][j] = input.nextInt();
            }
        }
    }
    
    public String getValues() {
        return "";
    }
    
    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        values = new int[row][col];
    }
    
    public Matrix add(Matrix b) {
        
        return new Matrix();
    }
}
