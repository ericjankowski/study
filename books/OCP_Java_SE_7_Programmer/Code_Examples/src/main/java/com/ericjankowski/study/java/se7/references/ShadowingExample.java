package com.ericjankowski.study.java.se7.references;

public class ShadowingExample {
    static int size = 7;
    static void changeIt(int size){
        size = size + 200;
        System.out.println("size in changeIt is " + size);
    }
    
    public static void main(String[] args) {
        System.out.println("size = " + size);
        changeIt(size);
        System.out.println("size after changeIt() is " + size);
    }
}
