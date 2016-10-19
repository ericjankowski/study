package com.erj.practice.statics;

public class Frog {
    static int frogCount = 0;
    
    public Frog(){
        frogCount++;
    }
    
    public static void main(String[] args) {
        new Frog();
        new Frog();
        new Frog();
        System.out.println("Frog count is now " + frogCount);
    }
    
}
