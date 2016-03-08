package com.ericjankowski.study.java.se7.other;

import com.ericjankowski.study.java.se7.certification.Parent;

public class Child extends Parent{
    public void testIt(){
        System.out.println("x is " + x);
        // The Child class inherits the variable x from the Parent class 
    }
    
    public static void main(String [] args){
        Child child = new Child();
        child.testIt();
    }
}
