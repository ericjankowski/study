package com.ericjankowski.study.java.se7.references;

import java.awt.Dimension;

public class ObjectReferenceTest {
    public static void main(String[] args) {
        Dimension d = new Dimension(5, 10);
        ObjectReferenceTest rt = new ObjectReferenceTest();
        System.out.println("Before modify() d.height = " + d.height);
        rt.modify(d);
        System.out.println("After modify() d.height = " + d.height);
    }
    
    public void modify(Dimension dim){
        dim.height = dim.height + 1;
        System.out.println("Within modify(), dim = " + dim.height);
    }
}
