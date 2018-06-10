/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class FileManager {
    
    private Scanner input;
    public FileManager() {
        input = new Scanner(System.in);
    }
    private String enterPath() {
        System.out.print("(Path ?) > ");
        String path = input.nextLine();
        return path;
    }
    private File getSelectedFile() {
        String path = enterPath();
        File f = new File(path);
        if (f.exists()){
            return f;
        }
        else {
            System.out.println("File not found!");
            return null;
        }
            
    }
    public void listFile() {
        File selectedFile = getSelectedFile();
           
        if (selectedFile != null) {
            File[] listFiles = selectedFile.listFiles();
            for (File file : listFiles) {
                System.out.println(file.getName());
            }    
        }
    }
    public void deleteFile() {
        File selectedFile = getSelectedFile();
        if (selectedFile != null) {
            boolean delete = selectedFile.delete();
            if (delete) {
                System.out.println("File deleted");
            } else {
                System.out.println("Delete fail");
            }
        }
    }
    public void renameFile() {
        File selectedFile = getSelectedFile();
        if (selectedFile != null) {
            System.out.print("(New Path ?) > ");
            String newPath = input.nextLine();
            boolean renameTo = selectedFile.renameTo(new File(newPath));
            if (renameTo) {
                System.out.println("Rename success.");
            } else {
                System.out.println("Rename fail.");
            }
        }
    }
    public void createFile() throws IOException {
        String path = enterPath();
        File f = new File(path);
        if (!f.exists()) {
            boolean createNewFile = f.createNewFile();
            if (createNewFile) {
                System.out.println("File created.");
            } else {
                System.out.println("Create fail.");
            }
            /**
             * TODO
             * - Cho phep ng dung nhap noi dung file
             * - Noi dung file sẽ chứa dữ liệu text, có thể 
             * có nhiều dòng
             * - Người dùng nhập đến khi nhập exit.
             * 
             * Hint: Sử dụng PrintWriter kết hợp vòng lặp (while)
             * điều kiện kết thúc là khi ng dùng nhập exit
             */
            
        } else {
            System.out.println("File exist!");
        }
    }
}
