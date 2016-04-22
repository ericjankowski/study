package com.ericjankowski.study.java.se7.blocks;

public class Truck extends Vehicle{
    static{
        System.out.println("Truck - Static init block");
    }
    {
        System.out.println("Truck - Instance init block");
    }
    public Truck(){
        System.out.println("Truck - Constructor code");
    }
}
