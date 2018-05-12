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
public class UserManager {
    private User[] list;
    final int SIZE = 10;
    private int index = 0;
    private Scanner input;
    
    public UserManager() {
        this.list = new User[SIZE];
        this.input = new Scanner(System.in);
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
        
        //lưu vào mảng.
        this.list[index] = u;
        index++;
    }
    
    public void listUser() {
        System.out.println("--------------------------------------");
        for (int i = 0; i < index; i++) {
            System.out.println(list[i]);
            System.out.println("--------------------------------------");
        }
    }
    
    public void search(String name) {
        boolean flag = false; // đánh dấu xem là có tìm thấy user hay không
        // flag = false: không tìm thấy user thỏa mãn
        // flag = true; tìm thấy
        
        for (int i = 0; i < index; i++) {
            if (list[i].getUserName().equals(name)) {
                flag = true;
                System.out.println("Tìm thấy");
                System.out.println(list[i]);
                System.out.println("----------------------------------");
            }
        }
        
        if (!flag) {
            System.out.println("Không tìm thấy.");
        }
    }
    
    public void updateUser() {
        // tìm kiếm theo username và password
        System.out.print("Username: ");
        String uname = input.nextLine();
        
        System.out.print("Password: ");
        String pass = input.nextLine();
        
        boolean flag = false;
        for (int i = 0; i < index; i++) {
            if (list[i].getUserName().equals(uname)
                    && list[i].getPassword().equals(pass)) {
                flag = true;
                System.out.println("Nhập thông tin sửa đổi.");
                System.out.print("Email: ");
                list[i].setEmail(input.nextLine());

                System.out.print("Phone: ");
                list[i].setPhone(input.nextLine());
            }
        }
        if (!flag) {
            System.out.println("Sai username hoặc password.");
        }
    }
}
