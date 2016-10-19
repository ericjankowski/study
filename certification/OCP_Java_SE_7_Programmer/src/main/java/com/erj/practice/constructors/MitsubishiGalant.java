package com.erj.practice.constructors;

public class MitsubishiGalant extends Car {
    public MitsubishiGalant(){
        System.out.println("MitsubishiGalant constructor");
    }
    
    static {
        System.out.println("MitsubishiGalant static init");
    }
    
    {
        System.out.println("MitsubishiGalant instance init");
    }
    
    public static void main(String[] args) {
        MitsubishiGalant g = new MitsubishiGalant();
    }
}
