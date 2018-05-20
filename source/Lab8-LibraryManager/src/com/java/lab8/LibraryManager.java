/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.lab8;

/**
 *
 * @author pc
 */
public class LibraryManager {
    
    private Document[] docs;
    private final int SIZE = 10;
    private int index;
//    private Book[] books;
//    private Paper[] papers;
//    private Thesis[] thesis;

    public LibraryManager() {
        docs = new Document[SIZE];
        index = 3;
        
        docs[0] = new Book("Hanoi", "1", "2018", "B01", "Dai so", "Ko ro", 12);
        docs[1] = new Paper("Ko ro", "2018", "P02", "Lap trinh Java", "JG", 33);
        docs[2] = new Thesis("KMA", "AT", "2018", "T03", "Quan ly thu vien", "Tran van An", 1);
    }
    
    public void input(int category){
        switch (category) {
            case 1: 
                Book b = new Book();
                b.input();
                docs[index++] = b;
                break;
            case 2: 
                Paper p = new Paper();
                p.input();
                docs[index++] = p;
                break;
            case 3: 
                Thesis t = new Thesis();
                t.input();
                docs[index++] = t;
                break;
        }
    }
//    public void input(Document doc){
//        doc.input();
//        docs[index++] = doc;
//    }
    
    /**
     * Hiển thị toàn bộ danh sách tài liệu.
     */
    public void display() {
        System.out.println("----BOOK------");
        for (int i = 0; i < index; i++) {
            if (docs[i] instanceof Book)
                System.out.println(docs[i]);
        }
        System.out.println("------PAPER-----");
        for (int i = 0; i < index; i++) {
            if (docs[i] instanceof Paper)
                System.out.println(docs[i]);
        }
        System.out.println("-----THESIS----");
        for (int i = 0; i < index; i++) {
            if (docs[i] instanceof Thesis)
                System.out.println(docs[i]);
        }
        
    }
    
    /**
     * Tim kiem
     * @param category
     * @param name 
     */
    public void search(int category, String title) {
    
        boolean found = false;
        for (int i = 0; i < index; i++) {
            if (category == 1) {
                if (docs[i] instanceof Book && 
                        docs[i].getTitle().equals(title)) {
                    System.out.println("Ket qua");
                    System.out.println(docs[i]);
                    found = true;
                    break;
                }    
            }
            else if (category == 2) {
                if (docs[i] instanceof Paper && 
                        docs[i].getTitle().equals(title)) {
                    System.out.println("Ket qua");
                    System.out.println(docs[i]);
                    found = true;
                    break;
                }    
            } else {
                if (docs[i] instanceof Thesis && 
                        docs[i].getTitle().equals(title)) {
                    System.out.println("Ket qua");
                    System.out.println(docs[i]);
//                    docs[i].display();
                    found = true;
                    break;
                }
            }
            
        }
        
        if (!found) 
            System.out.println("Khong tim thay");
    }
    
}
