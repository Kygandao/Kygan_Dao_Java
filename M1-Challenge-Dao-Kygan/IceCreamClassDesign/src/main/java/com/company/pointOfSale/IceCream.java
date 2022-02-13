package com.company.pointOfSale;

import java.util.Objects;

public class IceCream {

    private String flavor;
    private int price;
    private int quantity;

    public IceCream(String flavor, int price, int quantity) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
    }

    public IceCream() {

    }

    //Getters
    public String getFlavor () {
        return flavor;
    }

    public int getPrice () {
        return price;
    }

    public int getQuantity () {
        return quantity;
    }

    //Setters
    public void setFlavor (String flavor){
        this.flavor = flavor;
    }

    public void setPrice ( int price){
        this.price = price;
    }

    public void setQuantity ( int quantity){
        this.quantity = quantity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream posIceCream = (IceCream) o;
        return getQuantity() == posIceCream.getQuantity() &&
                Objects.equals(getFlavor(), posIceCream.getFlavor()) &&
                getPrice() == posIceCream.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlavor(), getPrice(), getQuantity());
    }
}
