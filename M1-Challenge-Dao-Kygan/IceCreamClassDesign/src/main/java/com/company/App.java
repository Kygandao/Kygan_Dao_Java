package com.company;


public class App {

    public static void main(String[] args) {

        //create and display new ice cream from the factory
        com.company.factory.IceCream factoryIceCream = new com.company.factory.IceCream(
                "Vanilla", 5.6, 1.2, 0.2, "milk");

        System.out.println(
                "Flavor : " + factoryIceCream.getFlavor() + "\n" +
                "Sale Price : " + factoryIceCream.getSalePrice() + "\n" +
                "Production Cost : " + factoryIceCream.getProductionCost() + "\n" +
                "Production Time : " + factoryIceCream.getProductionTime() + "\n" +
                "Ingredients : " + factoryIceCream.getIngredients()
        );

        //create and display new ice cream from the point of sale
        com.company.pointOfSale.IceCream pointOfSaleIceCream = new com.company.pointOfSale.IceCream("Chocolate", 6, 2);

        System.out.println("Flavor : " + pointOfSaleIceCream.getFlavor() + "\n" +
                "Price : " + pointOfSaleIceCream.getPrice() + "\n" +
                "Quantity : " + pointOfSaleIceCream.getQuantity() );

    }


}
