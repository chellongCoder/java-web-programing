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
        try {
            Scanner input = new Scanner(System.in);
            FileManager fm = new FileManager();

            do {
                System.out.println("----MENU----");
                System.out.println("1. List file");
                System.out.println("2. Delete file");
                System.out.println("3. Rename file");
                System.out.println("4. Create file");
                System.out.println("5. Exit");
                System.out.print("Choice");
                int choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        fm.listFile();
                        break;
                    case 2:
                        fm.deleteFile();
                        break;
                    case 3:
                        fm.renameFile();
                        break;
                    case 4:
                        fm.createFile();
                        break;
                    default:
                        System.exit(0);
                }
            } while (true);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
