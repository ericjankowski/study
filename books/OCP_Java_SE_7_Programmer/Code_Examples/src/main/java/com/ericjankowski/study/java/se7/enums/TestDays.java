package com.ericjankowski.study.java.se7.enums;

public class TestDays {
    public enum Days {MON, TUE, WED};
    public static void main(String[] args) {
        for(Days d : Days.values());
        Days [] d2 = Days.values();
        System.out.println(d2[2]);
    }
}
