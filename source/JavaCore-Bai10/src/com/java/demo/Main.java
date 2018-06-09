/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

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
//            Student s = new Student("Hoang", "demo@gmail.com", 22);
//            Student[] arr = new Student[2];
//            arr[0] = s;
//            arr[1] = new Student("Hoa", "hoa@gmail.com", 33);
//            
//            ObjectOutputStream oos = 
//                    new ObjectOutputStream(
//                    new FileOutputStream("/Users/pc/Desktop/demo/stud_list.out"));
//            
//            oos.writeObject(arr);
//            oos.flush();
//            oos.close();
            
            ObjectInputStream ois = 
                    new ObjectInputStream(
                    new FileInputStream("/Users/pc/Desktop/demo/stud_list.out"));
            
            Student[] arr = (Student[]) ois.readObject();
            ois.close();
            
            for (Student s : arr) {
                System.out.println(s);
            }
            //DOc file
//            BufferedReader reader = new BufferedReader(
//                    new InputStreamReader(
//                    new FileInputStream("/Users/pc/Desktop/demo/demo.txt")));
//            
//            String content = reader.readLine();
//            while (content != null) {
//                System.out.println(content);
//                content = reader.readLine();
//            }
// GHi file
//            PrintWriter writer = new PrintWriter("/Users/pc/Desktop/demo/data.out");
//            writer.println("Hello");
//            writer.println(123.213);
//            writer.printf("so %d", 33);
//            
//            writer.flush();
//            writer.close();
//
//            File demoFile = new File("/Users/pc/Desktop/Desktop");
//            FileInputStream fis = new FileInputStream(demoFile);
//            FileInputStream fis = new FileInputStream("/Users/pc/Desktop/Icon-App-76x76@3x.png");
//            FileOutputStream fos = new FileOutputStream("/Users/pc/Desktop/demo/anh.png");
//            int size = fis.available();
//            
//            for (int i = 0; i < size; i++) {
//                fos.write(fis.read());
//                fos.flush();
////                System.out.print(fis.read());
//            }
//            fis.close();
//            fos.close();
//            File[] listFiles = demoFile.listFiles();
//            for (File file : listFiles) {
//                if (file.isDirectory())
//                    System.out.println(file.getName());
//            }
//            String absolutePath = demoFile.getAbsolutePath();
//            System.out.println(absolutePath);
//            demoFile.
//        if (demoFile.exists()) {
//            if (demoFile.isFile())
//                System.out.println("Day la file");
//            else if (demoFile.isDirectory())
//                System.out.println("Day khong phai la file. Day laf folder");
//            
//            boolean rs = demoFile.delete();
//
//            if (rs) {
//                System.out.println("Da xoa.");
//            } else {
//                System.out.println("Khong xoa duoc.");
//            }    
//        } else {
//            System.out.println("File khong ton tai.");
//            if (demoFile.isDirectory()) {
//                demoFile.mkdir();
//            }
//            else {
//                boolean createFile = demoFile.createNewFile();
//                if (createFile)
//                    System.out.println("Tao file thanh cong.");
//                else 
//                    System.out.println("Khong tao duoc file");
//            }
//                
//        }
//        demoFile.renameTo(new File("/Users/pc/Desktop/test1.txt"));
//        File demoFile = new File("/Users/pc/Desktop/demo", "demo.txt");
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
