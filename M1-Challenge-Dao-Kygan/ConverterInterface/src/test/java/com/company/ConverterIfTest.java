package com.company;

import com.company.interfaces.Converter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {

    Converter converter;

    @Before
    public void setUp() throws Exception {
        converter = new ConverterIf();
    }

    //TEST MONTH CONVERSION
    @Test
    public void shouldReturnMonthAsString() {

        assertEquals("December", converter.convertMonth(12));
        assertEquals("January", converter.convertMonth(1));
        assertEquals("June", converter.convertMonth(6));

    }

    //TEST DAY CONVERSION
    @Test
    public void shouldReturnDayAsString() {

        assertEquals("Sunday", converter.convertDay(1));
        assertEquals("Monday", converter.convertDay(2));
        assertEquals("Friday", converter.convertDay(6));

    }
}