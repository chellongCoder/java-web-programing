/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class UserManager {

    private List<User> list;
    private Scanner input;
    public UserManager() {
        list = new ArrayList<>();
        input = new Scanner(System.in);
    }
    
    public void createUser() {
        User u = new User();
        System.out.print("Username: ");
        u.setUserName(input.nextLine());
        System.out.print("Password: ");
        u.setPassword(input.nextLine());
        System.out.print("Email: ");
        u.setEmail(input.nextLine());
        System.out.print("Phone: ");
        u.setPhone(input.nextLine());
        // luu vao list
        this.list.add(u);
    }
    
    public void listUser() {
        System.out.println("--------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            System.out.println("--------------------------------------");
        }
    }
    
    public void search(String name){
        boolean flag = false; 
        for (User user : list) {
            if (user.getUserName().equals(name)) {
                System.out.println("TIM THAY");
                System.out.println(user);
                flag = true;
            }
        }
        if (!flag)
            System.out.println("KHONG TIM THAY");
    }
    
    public void updateUser() {
        System.out.print("Username: ");
        String uname = input.nextLine();
        
        System.out.print("Password: ");
        String pass = input.nextLine();
        
        boolean flag = false;
        for (User user : list) {
            if (user.getUserName().equals(uname)
                    && user.getPassword().equals(pass)) {
                flag = true;
                System.out.println("Nhập thông tin sửa đổi.");
                System.out.print("Email: ");
                user.setEmail(input.nextLine());

                System.out.print("Phone: ");
                user.setPhone(input.nextLine());
            }
        }
        if (!flag) {
            System.out.println("Sai username hoặc password.");
        }
    }
    
}
