package com.company;

import com.company.interfaces.Converter;

public class ConverterIf implements Converter {

    String months[] = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
    };

    String days[] = {
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
    };

    //CONVERT MONTH NUMBER TO MONTH STRING USING IF/ELSE
    @Override
    public String convertMonth(int monthNumber) {
        if(monthNumber > 12 || monthNumber < 1) {
            System.out.println("There is no month for that number");
        }
        return months[monthNumber - 1];
    };

    //CONVERT DAY NUMBER TO DAY STRING USING IF/ELSE
    @Override
    public String convertDay(int dayNumber) {
        if (dayNumber > 7 || dayNumber < 1) {
            System.out.println("There is no day for that number");
        }
        return days[dayNumber - 1];
    }

}
