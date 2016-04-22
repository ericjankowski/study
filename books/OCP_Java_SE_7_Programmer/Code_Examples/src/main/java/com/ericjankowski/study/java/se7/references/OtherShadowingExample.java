package com.ericjankowski.study.java.se7.references;

public class OtherShadowingExample {
    Bar myBar = new Bar();
    void changeIt(Bar myBar){
        myBar.barNum = 99;
        System.out.println("myBar.barNum in changeIt is " + myBar.barNum);
        myBar = new Bar();
        myBar.barNum = 420;
        System.out.println("myBar.barNum in changeIt is now " + myBar.barNum);
    }
    
    public static void main(String[] args) {
        OtherShadowingExample e = new OtherShadowingExample();
        System.out.println("e.myBar.barNum is " + e.myBar.barNum);
        e.changeIt(e.myBar);
        System.out.println("e.myBar.barNum after changeIt is " + e.myBar.barNum);
    }
}

class Bar{
    int barNum = 28;
}
