package com.ericjankowski.study.java.se7.references;

public class PrimitiveReferenceTest {
    public static void main(String[] args) {
        int a = 1;
        PrimitiveReferenceTest prt = new PrimitiveReferenceTest();
        System.out.println("Before modify() a = " + a);
        prt.modify(a);
        System.out.println("After modify() a = " + a);
        
    }

    public void modify(int number) {
        number = number + 1;
        System.out.println("Within modify(), number = " + number);
    }
}
