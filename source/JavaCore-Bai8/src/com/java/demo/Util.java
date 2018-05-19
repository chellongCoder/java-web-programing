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
public class Util {
    
    public double calcShape(Shape shape) {
        if (shape instanceof Square) {
            System.out.println("Day la hinh vuog");
        }
        if (shape instanceof Rectangle) {
            System.out.println("Day laf hinh cn");
        }
        return shape.calculateArea();
    }
//    public double calcAreaSquare(double width) {
//        return 0.0;
//    }
//    public double calcAreaRectangle(double width, double height) {
//        return 0.0;
//    }
//    public double calcAreaCirle(double radius) {
//        return 0.0;
//    }
//    public double calcAreaTriangle(double a, double b, double c) {
//        return 0.0;
//    }
    
}
