package com.company.pointOfSale;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class posIceCreamTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void shouldSayIceCreamIsEqual() {

        com.company.pointOfSale.IceCream posIceCream = new com.company.pointOfSale.IceCream();
        posIceCream.setFlavor("Chocolate");
        posIceCream.setPrice(5);
        posIceCream.setQuantity(2);
        System.out.println(posIceCream);

        com.company.pointOfSale.IceCream posIceCream2 = new com.company.pointOfSale.IceCream();
        posIceCream2.setFlavor("Chocolate");
        posIceCream2.setPrice(5);
        posIceCream2.setQuantity(2);
        System.out.println(posIceCream2);


        assertEquals(posIceCream, posIceCream2);
    }
}