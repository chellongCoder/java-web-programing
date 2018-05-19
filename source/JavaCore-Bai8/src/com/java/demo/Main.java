/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

import com.java.demo.itf.Circle;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
//        Square s = new Square(3);
//        Shape s = new Square(3);
//        double area = s.calculateArea();
//        System.out.println("Area: " + area);

//        Circle c = new Circle(3);
//        double calcArea = c.calcArea();
//        System.out.println(calcArea);

        Util util = new Util();
        Square square = new Square(4);
        Rectangle rect = new Rectangle(4, 5);
        
//        double area = util.calcShape(square);
//        System.out.println("Area " + area);
        
        double area2 = util.calcShape(rect);
        System.out.println("Area " + area2);
        
        
//        util.calcShape(c);
        
    }
    
}
