package com.company.factory;

import com.company.pointOfSale.IceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void shouldSayIceCreamIsEqual() {

        com.company.factory.IceCream factoryIceCream = new com.company.factory.IceCream();
        factoryIceCream.setFlavor("Chocolate");
        factoryIceCream.setSalePrice(5.5);
        factoryIceCream.setProductionCost(2.5);
        factoryIceCream.setProductionTime(0.5);
        factoryIceCream.setIngredients("Milk");
        System.out.println(factoryIceCream);

        com.company.factory.IceCream factoryIceCream2 = new com.company.factory.IceCream();
        factoryIceCream2.setFlavor("Chocolate");
        factoryIceCream2.setSalePrice(5.5);
        factoryIceCream2.setProductionCost(2.5);
        factoryIceCream2.setProductionTime(0.5);
        factoryIceCream2.setIngredients("Milk");
        System.out.println(factoryIceCream2);

        assertEquals(factoryIceCream, factoryIceCream2);
    }
}