package com.ericjankowski.study.java.se7.strings;

public class StringReferenceTest {
    public static void main(String[] args) {
        String s = "Fred";
        String t = s;
        
        System.out.println("String s = " + s);
        System.out.println("String t = " + t);
        
        t.toUpperCase();
        
        System.out.println("\nString s = " + s);
        System.out.println("String t = " + t);
        
        t = t.toUpperCase();
        
        System.out.println("\nString s = " + s);
        System.out.println("String t = " + t);
        
    }
}
