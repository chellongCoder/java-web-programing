/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.ex;

/**
 *
 * @author pc
 */
public class StudentManager {
    
    private Student[] listStudents;
    private int index;
    final int SIZE = 10;

    public StudentManager() {
        listStudents = new Student[SIZE];
        index = 0;
    }
    
    /**
     * Thêm 1 thông tin SV vào trong danh sách
     * mảng listStudent
     * 
     * @param stud - biến lưu trữ thông tin của 1 sv
     * @return true|false - true: thêm thành công, false: thêm thất bại
     * thêm thất bại số lượng sv vượt quá kích thước mảng.
     */
    public boolean add(Student stud) {
        if (index >= listStudents.length) return false;
        listStudents[index] = stud;
        index++;
        return true;
    }
    
    /**
     * Tìm kiếm thông tin sv và hiển thi kết quả 
     * theo tên
     * 
     * @param name : tên sinh viên muốn tìm
     * 
     */
    public void search(String name) {
        boolean found = false;
        for (int i = 0; i < index; i++) {
            if (listStudents[i].getName().equals(name)) {
                System.out.println(listStudents[i].getName()+ " | " + listStudents[i].getEmail() + " | " + listStudents[i].getAge());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student not found!!!");
        }
    }
    
    /**
     * Hiển thị danh sách toàn bộ sinh viên
     * 
     */
    public void list() {
        for (int i = 0; i < index; i++) {
            System.out.println(listStudents[i].getName()+ " | " + listStudents[i].getEmail() + " | " + listStudents[i].getAge());
        }
    }
    
    /**
     * Hiển thị danh sách sv và sắp xếp theo thứ tự
     * 
     * @param order - true: tăng dần theo tên
     *              - false: giảm dần theo tên
     */
    public void list(boolean order) {
        for (int i = 0; i < listStudents.length - 1; i++) {
            for (int j = i + 1; j < listStudents.length; j++) {
                if (order) {
                    if (listStudents[i].getName()
                            .compareTo(listStudents[j].getName()) > 0) {
                        Student temp = listStudents[i];
                        listStudents[i] = listStudents[j];
                        listStudents[j] = temp;
                    }    
                } else {
                    if (listStudents[i].getName()
                            .compareTo(listStudents[j].getName()) < 0) {
                        Student temp = listStudents[i];
                        listStudents[i] = listStudents[j];
                        listStudents[j] = temp;
                    }
                }
            }
        }
        
        for (int i = 0; i < index; i++) {
            System.out.println(listStudents[i].getName()+ " | " + listStudents[i].getEmail() + " | " + listStudents[i].getAge());
        }
    }
}
