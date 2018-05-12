/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.exe;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UserManager manager = new UserManager();
        while (true) {
         System.out.println("1. Register");
        System.out.println("2. List user");
        System.out.println("3. Search");
        System.out.println("4. Update");
        System.out.println("5. Exit");
        System.out.print("Choice: ");
        int c = Integer.parseInt(input.nextLine());
        switch (c) {
            case 1:
                manager.createUser();
                break;
            case 2:
                manager.listUser();
                break;
            case 3:
                System.out.print("Name: ");
                String name = input.nextLine();
                manager.search(name);
                break;
            case 4:
                manager.updateUser();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Nhap sai");
        }   
        }
        
    }
}
