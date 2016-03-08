package com.ericjankowski.study.java.se7.somethingElse;

import com.ericjankowski.study.java.se7.certification.OtherClass;

class AccessClass {
    public static void main(String[] args) {
        OtherClass o = new OtherClass();
        o.testIt(); 
        // This causes a compiler error because a method with default 
        // access can not be accessed by anything outside the package
    }
}
