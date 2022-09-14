package com.alexmansar.homework.lesson14.propertyTax;

public class ResidentialProperties extends PropertyTax {
    protected final float SUBSIDY=0.75f;

    public ResidentialProperties( String nameOfProperty, float area, float taxK) {
        super(area, taxK, nameOfProperty);
    }

    public String toString() {
        return "Your tax for " + nameOfProperty + " is " + calculateTaxForType() + "UAH " +" taxK=" + calculateTaxForType()*100/area+"%"+" and for your area "+ area + "m2, for you subsidy "+ (1-SUBSIDY)+"UAH/m2";
    }


    public float calculateTaxForType() {
        return this.area * this.taxK * SUBSIDY;
    }
}