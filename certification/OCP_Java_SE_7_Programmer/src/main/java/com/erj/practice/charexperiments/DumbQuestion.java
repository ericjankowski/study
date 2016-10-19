package com.erj.practice.charexperiments;

public class DumbQuestion {
    public static void main(String[] args) {
        char[] ca = {0x3e, \u004e, 78};
        System.out.println((ca[0]==ca[1]) + " " + (ca[0]==ca[2]));
        
    }
}
