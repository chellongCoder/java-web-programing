/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
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
        StudentManager sm = new StudentManager();
        do {

            System.out.println("---Student Manager---");
            System.out.println("1.  List");
            System.out.println("2.  Search");
            System.out.println("3.  Add");
            System.out.println("4.  Exit");
            System.out.print("Choice: ");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    sm.list();
                    break;
                case 2:
                    System.out.print("Name: ");
                    String name = input.nextLine();
                    sm.search(name);
                    break;
                case 3:
                    Student stud = new Student();
                    System.out.print("Name");
                    stud.setName(input.nextLine());

                    System.out.print("Email");
                    stud.setEmail(input.nextLine());

                    System.out.print("Age");
                    stud.setAge(Integer.parseInt(input.nextLine()));
                    sm.add(stud);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error!!!");
            }

        } while (true);

    }

}
