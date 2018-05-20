/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.lab8;

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
        LibraryManager lm = new LibraryManager();
//        for (int i = 0; i < 3; i++) {
//            System.out.print("Category (1: Book, 2: Paper, 3: Thesis): ");
//            int cate = Integer.parseInt(input.nextLine());
//            
//            lm.input(cate);
////           lm.input(new Book());
//        }
        
//        lm.display();

        lm.search(2, "Dai so");
    }
    
}
