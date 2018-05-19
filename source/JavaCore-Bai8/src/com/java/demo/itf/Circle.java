/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.itf;

/**
 *
 * @author pc
 */
public class Circle extends Shape implements IShape, IPeople{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    
    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("test");
    }
    
}
