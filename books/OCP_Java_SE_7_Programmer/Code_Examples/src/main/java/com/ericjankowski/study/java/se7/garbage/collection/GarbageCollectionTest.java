package com.ericjankowski.study.java.se7.garbage.collection;

import java.util.ArrayList;
import java.util.Date;

public class GarbageCollectionTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total JVM memory: \t" + runtime.totalMemory());
        System.out.println("Before memory: \t\t" + runtime.freeMemory());
        
        ArrayList<Date> dList = new ArrayList<>();
        
        for(int i = 0; i<100_000_000;i++){
            dList.add(new Date());
        }
        
        System.out.println("After memory: \t\t" + runtime.freeMemory());
        dList = null;
        System.out.println("After nulling memory: \t" + runtime.freeMemory());
        runtime.gc();
        System.out.println("After GC memory: \t" + runtime.freeMemory());
    }
}
