package com.ericjankowski.study.java.se7.polymorphismo;

public class TestAnimals {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse();
        a.eat();
        b.eat();
    }
}
