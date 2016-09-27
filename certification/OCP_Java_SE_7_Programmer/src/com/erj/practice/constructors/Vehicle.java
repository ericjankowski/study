package com.erj.practice.constructors;

public class Vehicle {
    public Vehicle(){
        System.out.println("Vehicle constructor");
    }
    
    static {
        System.out.println("Vehicle static init");
    }
    
    {
        System.out.println("Vehicle instance init");
    }
}
