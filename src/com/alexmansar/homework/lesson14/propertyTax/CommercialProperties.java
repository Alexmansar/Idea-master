package com.alexmansar.homework.lesson14.propertyTax;

public class CommercialProperties extends PropertyTax {
    protected float revenue;
    int MAX_REVENUE = 100;

    public CommercialProperties(String nameOfProperty,float area, float taxK, float revenue) {
        super(area, taxK,nameOfProperty);
        this.revenue = revenue;
    }
    @Override
    public String toString() {
        return "Your tax for " + nameOfProperty + " is " + calculateTaxForType() + "UAH " +" taxK=" + calculateTaxForType()*100/area+"%"+" and for your area "+ area + "m2, for you revenue "+ revenue+"UAH";
    }

    private float checkRevenue() {
        float tax;
        if (this.revenue > this.MAX_REVENUE) {
            tax =2;
        } else {
            tax = 0;
        }
        return tax;
    }

    public float calculateTaxForType() {
        return this.area * this.taxK* checkRevenue();
    }
}