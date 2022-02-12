package com.company.factory;

public class IceCream {

    private String flavor;
    private double salePrice;
    private double productionCost;
    private double productionTime;
    private String ingredients;

    public IceCream(String flavor, double salePrice, double productionCost, double productionTime, String ingredients) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
    }


        public String getFlavor () {
            return flavor;
        }

        public double getSalePrice () {
            return salePrice;
        }

        public double getProductionCost () {
            return productionCost;
        }

        public double getProductionTime () {
            return productionTime;
        }

        public String getIngredients () {
            return ingredients;
        }

        public void setFlavor (String flavor){
            this.flavor = flavor;
        }

        public void setSalePrice ( double salePrice){
            this.salePrice = salePrice;
        }

        public void setProductionCost ( double productionCost){
            this.productionCost = productionCost;
        }

        public void setProductionTime ( double productionTime){
            this.productionTime = productionTime;
        }

        public void setIngredients (String ingredients){
            this.ingredients = ingredients;
        }

}