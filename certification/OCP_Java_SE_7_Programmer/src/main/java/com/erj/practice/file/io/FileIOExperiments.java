package com.erj.practice.file.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIOExperiments {
    public static void main(String[] args) {
        char[] in = new char [50];
        int size = 0;
        
        try{
            File file = new File("fileWrite2.txt");
            FileWriter fw = new FileWriter(file);
            fw.write("howdy\nfolks\n");
            fw.flush();
            fw.close();
            
            FileReader fr = new FileReader(file);
            size = fr.read(in);
            System.out.print(size + " ");
            for(char c : in){
                System.out.print(c);
            }
            fr.close();
        }catch(IOException e){
            System.out.println("Exception caught during file IO");
        }
        System.out.println("\n\n-------------------\n\n");
        try{
            File file = new File("fileWrite3.txt");
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("howdy");
            pw.println("folks");
            pw.flush();
            pw.close();
            
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String data = br.readLine();
            while(data != null){
                System.out.println(data);
                data = br.readLine();
            }
            br.close();
        }catch(IOException e){
            System.out.println("Exception caught during file IO");
        }
    }
}
