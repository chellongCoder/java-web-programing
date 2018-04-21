/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

/**
 *
 * @author pc
 */
public class Student {

    private String studentNo;
    private String name;
    private int age;
    
    public Student() {
        System.out.println("Goi ham khoi tao mac dinh");
        studentNo = "";
        name = "";
        age = 0;
    }
    
    public Student(String name) {    
        this.studentNo = "";
        this.name = name;
        this.age = 0;
    }
    
    public Student(String name, int age) {
        this.studentNo = "";
        this.name = name;
        this.age = age;
    }
    
    public Student(String no, String name, int age) {
        this.studentNo = no;
        this.name = name;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setStudentNo(String no) {
        this.studentNo = no;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void ganTuoi(int age) {
        this.age = age;
    }
    
    public String printInfo() {
        return studentNo + ", " + name + ", " + age;
    }
}
