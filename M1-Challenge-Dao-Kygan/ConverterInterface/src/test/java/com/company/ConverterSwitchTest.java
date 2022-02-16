package com.company;

import com.company.interfaces.Converter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {

    Converter converter;

    @Before
    public void setUp() throws Exception {
        converter = new ConverterSwitch();
    }

    //TEST MONTH CONVERSION
    @Test
    public void shouldReturnMonthAsString() {
        String failMsg = "Expected to convert month number to month string";

        assertEquals(failMsg,"December", converter.convertMonth(12));
        assertEquals(failMsg,"January", converter.convertMonth(1));
        assertEquals(failMsg,"June", converter.convertMonth(6));

    }

    //TEST DAY CONVERSION
    @Test
    public void shouldReturnDayAsString() {
        String failMsg = "Expected to convert day number to day string";

        assertEquals(failMsg,"Sunday", converter.convertDay(1));
        assertEquals(failMsg,"Monday", converter.convertDay(2));
        assertEquals(failMsg,"Friday", converter.convertDay(6));

    }
}