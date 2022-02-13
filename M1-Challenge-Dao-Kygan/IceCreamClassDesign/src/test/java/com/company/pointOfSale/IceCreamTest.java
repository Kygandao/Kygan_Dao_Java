package com.company.pointOfSale;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void shouldSayIceCreamIsEqual() {

        IceCream posIceCream = new IceCream();
        posIceCream.setFlavor("Chocolate");
        posIceCream.setPrice(5);
        posIceCream.setQuantity(2);
        System.out.println(posIceCream);

        IceCream posIceCream2 = new IceCream();
        posIceCream.setFlavor("Chocolate");
        posIceCream.setPrice(5);
        posIceCream.setQuantity(2);
        System.out.println(posIceCream2);

        assertEquals(posIceCream, posIceCream2);
    }
}