package com.ericjankowski.study.java.se7.constructors;

public class Looper {
//    public Looper(){
//        this("Willis");
//    }
//    
//    public Looper(String s){
//        this();
//    }
    
    public static int count = 0;
    
    public static void go(){
        System.out.println(count++ + " : go");
        doStuff();
    }
    
    
    public static void doStuff(){
        System.out.println(count++ + " : do stuff  ");
        if(count > 11900){
            return;
        }
        go();
    }
    
    public static void main(String[] args) {
        try{
            go();
        }catch(StackOverflowError error){
            System.out.println(error.toString());
        }
    }
}
