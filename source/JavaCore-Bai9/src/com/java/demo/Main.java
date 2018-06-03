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
        // TODO code application logic here
        Calculate c = new Calculate();
        c.run();

              
/**
 * TODO: khi nnguời dùng nhập chữ 
 * thì chương trình 
 * hiển thị thông báo và yêu cầu người 
 * dùng nhập lại
 * 
 * khi người dùng nhập 0, không thực hiện 
 * được phép tính
 * hiển thị thông báo là phép tính 
 * không hợp lý
 * 
 */
//    try {
//        Scanner input = new Scanner(System.in);
//        System.out.print("a = ");
//        int a = Integer.parseInt(input.nextLine());
//        System.out.print("b = ");
//        int b = Integer.parseInt(input.nextLine());
//
//        System.out.println("Phep tinh (+/-/*/)");
//        String opt = input.nextLine();
//
//        System.out.println("a / b = " + (a / b));
//    } catch (NumberFormatException e) {
//        System.out.println("Loi khong duoc nhap chu.");
//    } catch (ArithmeticException ex) {
//        System.out.println("Loi khong chia duoc cho 0.");
//    } catch(Exception e) {
//        e.printStackTrace();
//        System.out.println("Chuong trinh co loi");
//    } finally {
//        System.out.println("Chuong trinh ket thuc.");
//    }
        
        
    }
    
}
