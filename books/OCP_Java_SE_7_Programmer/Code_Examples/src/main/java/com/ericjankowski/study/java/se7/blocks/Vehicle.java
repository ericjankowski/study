package com.ericjankowski.study.java.se7.blocks;

public class Vehicle {
    public Vehicle(){
        System.out.println("Vehicle - Constructor code");
    }
    static{
        System.out.println("Vehicle - Static init block");
    }
    {
        System.out.println("Vehicle - Instance init block");
    }
}
