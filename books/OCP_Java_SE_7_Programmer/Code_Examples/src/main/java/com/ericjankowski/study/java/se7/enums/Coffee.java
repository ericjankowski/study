package com.ericjankowski.study.java.se7.enums;

enum CoffeeSize {
    BIG(8), 
    HUGE(10), 
    OVERWHELMING(16){
        public String getLidCode(){
            return "A";
        }
    };
    
    private int ounces;
    
    CoffeeSize(int ounces){
        this.ounces = ounces;
    }
    
    public int getOunces(){
        return ounces;
    }
    
    public String getLidCode(){
        return "B";
    }
    
}
public class Coffee {
    CoffeeSize size;
    
    public static void main(String[] args) {
        Coffee drink1 = new Coffee();
        drink1.size = CoffeeSize.BIG;
        
        Coffee drink2 = new Coffee();
        drink2.size = CoffeeSize.OVERWHELMING;
        
        System.out.println(drink1.size.getOunces());
        
        for(CoffeeSize cs: CoffeeSize.values()){
            System.out.println(cs + " " + cs.getOunces() + " " + cs.getLidCode());
        }
    }
}
