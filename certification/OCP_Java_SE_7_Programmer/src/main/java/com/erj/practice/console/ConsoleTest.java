package com.erj.practice.console;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class ConsoleTest {
    public static void main(String[] args) {
        Console c = System.console();
        String line = c.readLine();
        while(!line.equals("exit")){
            c.format(String.valueOf(isVowel(line)));
        }
    }
    
    public static boolean isVowel(String s){
        List<String> vowels = new ArrayList<String>();
        vowels.add("A");
        vowels.add("E");
        vowels.add("I");
        vowels.add("O");
        vowels.add("U");
        
        return vowels.contains(s.toUpperCase());
        
    }
}
