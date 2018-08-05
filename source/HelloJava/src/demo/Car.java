/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.Serializable;

/**
 *
 * @author pc
 */
public class Car extends Verhical implements IVerhicle, IDevice, Serializable{
    public static final String ID = "T0001";
    private String maker;
    private String color;
    private double velocity;
    
    public Car() {
        System.out.print("Khoi tao");
        this.maker = "";
        this.color = "black";
        this.velocity = 0;
    }
    
    public Car(String maker, String color, double _velocity) {
        this.maker = maker;
        this.color = color;
        velocity = _velocity;
        model = "unknow";
    }
    
    @Override
    public void drive() {
//        super.drive();
        System.out.println("Car drive...");
        this.increaseSpeed();
    }
    
    public void increaseSpeed() {
        velocity++;
        System.out.println("Tang toc " + velocity);
    }
    
    public void increaseSpeed(double gap) {
        velocity += gap;
        System.out.println("Tang toc " + velocity);
    }
    
    public String getMaker() {
        return maker;
    }
    
    public double getVelocity() {
        return velocity;
    }

    @Override
    public void brake() {
        System.out.println("brake");
        velocity--;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
