package com.erj.practice.dateformatting;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleExperiment {
    public static void main(String[] args) {
        //From OCP book page 427
        Calendar c = Calendar.getInstance();
        c.set(2016, 10, 18);
        Date d = c.getTime();
        
        Locale locIT = new Locale("it", "IT");  // Italy
        Locale locPT = new Locale("pt");        // Portugal
        Locale locBR = new Locale("pt", "BR");  // Brazil
        Locale locIN = new Locale("hi", "IN");  // India
        Locale locJA = new Locale("ja");        // Japan
        
        DateFormat dfUS = DateFormat.getInstance();
        System.out.println("US        " + dfUS.format(d));

        DateFormat dfUSfull = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("US full   " + dfUSfull.format(d));

        DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIT);
        System.out.println("Italy     " + dfIT.format(d));

        DateFormat dfPT = DateFormat.getDateInstance(DateFormat.FULL, locPT);
        System.out.println("Portugal  " + dfPT.format(d));

        DateFormat dfBR = DateFormat.getDateInstance(DateFormat.FULL, locBR);
        System.out.println("Brazil    " + dfBR.format(d));

        DateFormat dfIN = DateFormat.getDateInstance(DateFormat.FULL, locIN);
        System.out.println("India     " + dfIN.format(d));

        DateFormat dfJA = DateFormat.getDateInstance(DateFormat.FULL, locJA);
        System.out.println("Japan     " + dfJA.format(d));
    }
}
