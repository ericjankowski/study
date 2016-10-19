package com.erj.practice.garbage.collection;

import java.util.ArrayList;
import java.util.Date;

public class CheckGC {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total JVM memory: " + rt.totalMemory());
        System.out.println("Before Memory = " + rt.freeMemory());
        ArrayList<Date> d = new ArrayList<>();
        for(int i = 0; i< 5_000_000; i++){
            d.add(new Date());
        }
        System.out.println("After Memory = " + rt.freeMemory());
        d = null;
        rt.gc();
        System.out.println("After GC Memory = " + rt.freeMemory());
    }
}
