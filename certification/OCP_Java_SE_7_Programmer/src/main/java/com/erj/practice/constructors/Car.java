package com.erj.practice.constructors;

public class Car extends Vehicle{
    public Car(){
        System.out.println("Car constructor");
    }
    
    static {
        System.out.println("Car static init");
    }
    
    {
        System.out.println("Car instance init");
    }
}
