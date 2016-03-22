package com.ericjankowski.study.java.se7.overloading;

public class TestAdder {
    public static void main(String[] args) {
        Adder adder = new Adder();
        int a = 27;
        int b = 3;
        double c = 22.5;
        double d = 9.3;
        
        int result1 = adder.addThem(a, b);
        System.out.println("Result 1: " + result1);
        double result2 = adder.addThem(c, d);
        System.out.println("Result 2: " + result2);
        double result3 = adder.addThem(a,c);
        System.out.println("Result 3: " + result3);
    }
}
