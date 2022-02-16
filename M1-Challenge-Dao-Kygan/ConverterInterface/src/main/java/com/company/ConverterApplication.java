package com.company;

import com.company.interfaces.Converter;

public class ConverterApplication {
    public static void main(String[] args) {


        Converter conS = new ConverterSwitch();
        Converter conF = new ConverterIf();

        String dayS = conS.convertDay(4);
        System.out.println(dayS);
        String monS = conS.convertMonth(3);
        System.out.println(monS);

        String dayF = conF.convertDay(1);
        System.out.println(dayF);
        String monF = conF.convertMonth(11);
        System.out.println(monF);

    }

}
