package com.erj.practice.charexperiments;

public class CharTester {
    public static void main(String[] args) {
        char a = 0x982;
        char b = 982;
        char c = (char)70000;
        char d = (char) -98;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        int e = (int)d;
        
        System.out.println(e);
    }
}
