package com.ericjankowski.study.java.se7.polymorphismo;

public class TestAnimals {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse();
        a.eat();
        b.eat();
        
        TestAnimals test = new TestAnimals();
        Animal animal = new Animal();
        Horse horse = new Horse();
        test.doStuff(animal);
        test.doStuff(horse);
        
        Animal animalReferenceToHorse = new Horse();
        test.doStuff(animalReferenceToHorse);
    }
    
    public void doStuff(Animal a){
        System.out.println("This is the Animal version");
    }
    
    public void doStuff(Horse h){
        System.out.println("This is the Horse version");
    }
}
