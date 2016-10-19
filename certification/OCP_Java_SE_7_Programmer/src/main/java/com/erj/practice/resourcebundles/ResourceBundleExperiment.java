package com.erj.practice.resourcebundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExperiment {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "UK");
        ResourceBundle rb = ResourceBundle.getBundle("RB", locale);
        System.out.println(rb.getString("ride.in") + " " + rb.getString("elevator"));
    }
}
