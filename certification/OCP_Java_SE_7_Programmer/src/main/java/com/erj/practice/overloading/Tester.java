package com.erj.practice.overloading;

public class Tester{
    public void print(String s){
        System.out.println("I am a String " + s);
    }

    public void print(Object o){
        System.out.println("I am an Object " + o);
    }

    public static void main(String [] args){
        Tester tester = new Tester();
        Object o = new String("String");
        tester.print(o);
    }
}
