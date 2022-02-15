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

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
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

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
