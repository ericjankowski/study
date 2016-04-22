package com.ericjankowski.study.java.se7.blocks;

public class Tundra extends Truck{
    public Tundra(){
        System.out.println("Tundra - Constructor code");
    }
    static{
        System.out.println("Tundra - Static init block");
    }
    {
        System.out.println("Tundra - Instance init block");
    }
}
