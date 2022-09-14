package com.alexmansar.homework.lesson14.propertyTax;

public class PropertyTax {
    protected float area;
    protected float taxK;
    protected  String nameOfProperty;


    @Override
    public String toString() {
        return "Your tax for " + nameOfProperty + " is " + calculateTaxForType() + "UAH " +" taxK=" + taxK*100+"%"+" and for your area "+ area + "m2";
    }

    public PropertyTax(float area, float taxK, String nameOfProperty) {
        this.area = area;
        this.taxK = taxK;
        this.nameOfProperty = nameOfProperty;
    }

    public float calculateTaxForType() {
        return this.area * this.taxK;
    }

    public float getTaxK() {
        return taxK;
    }
}
