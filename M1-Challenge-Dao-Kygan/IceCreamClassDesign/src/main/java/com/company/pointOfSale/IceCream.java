package com.company.pointOfSale;

public class IceCream {

    private String flavor;
    private double price;
    private int quantity;

    public IceCream(String flavor, double price, int quantity) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
    }


    public String getFlavor () {
        return flavor;
    }

    public double getPrice () {
        return price;
    }

    public int getQuantity () {
        return quantity;
    }

    public void setFlavor (String flavor){
        this.flavor = flavor;
    }

    public void setPrice ( double price){
        this.price = price;
    }

    public void setQuantity ( int quantity){
        this.quantity = quantity;
    }


}
