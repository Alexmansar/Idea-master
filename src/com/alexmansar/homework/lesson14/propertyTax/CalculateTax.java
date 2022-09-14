package com.alexmansar.homework.lesson14.propertyTax;

import com.alexmansar.helper.Helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CalculateTax {
    private static final float TAX = 0.1f;
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        ArrayList<PropertyTax> propertyTaxes = new ArrayList<>();
        printPropertyType();
        int typeOfProperty = choiceTypeProperty();
        while (!READER.readLine().equalsIgnoreCase("stop")) {
            try {
                float revenue = checkCommercialType(typeOfProperty);
                Helper.print("Enter your area");
                float area = getFloatValue();
                calculateTax(area, revenue, typeOfProperty);
                PropertyTax tax = calculateTax(area, revenue, typeOfProperty);
                propertyTaxes.add(tax);
                tax.calculateTaxForType();
                System.out.println(tax);
            } catch (NullPointerException e) {
                System.out.println("Value might be for 1 to 3. Please try again");
            }
        }
        printOrderTax(propertyTaxes);
    }

    public static void printOrderTax(ArrayList<PropertyTax> propertyTaxes) {
        float orderPrice = 0;
        for (PropertyTax propertyTax : propertyTaxes) {
            orderPrice += propertyTax.calculateTaxForType();
            System.out.println(propertyTax);
        }
        System.out.println("The price of your order:  " + orderPrice + " UAH");
    }

    public static float checkCommercialType(int typeOfProperty) throws IOException {
        if (typeOfProperty == 1) {
            System.out.println("Enter your revenue");
            return getFloatValue();
        }
        return 0;
    }

    public static PropertyTax calculateTax(float area, float revenue, int typeOfProperty) {
        PropertyTax tax = null;
        switch (typeOfProperty) {
            case 1 -> tax = new CommercialProperties("commercial property", area, TAX, revenue);
            case 2 -> tax = new IndustrialProperties("industrial property", area, TAX);
            case 3 -> tax = new ResidentialProperties("residential property", area, TAX);
            // default -> {
            // System.out.println("Value might be for 1 to 3");
            //          tax = calculateTax(area, revenue, typeOfProperty);
    }
        return tax;
}

    public static int choiceTypeProperty() throws IOException {
        return Integer.parseInt(READER.readLine());
    }

    public static void printPropertyType() {
        System.out.println("Choose property type:" +
                System.lineSeparator() + "1 - Commercial" +
                System.lineSeparator() + "2 - Industrial" +
                System.lineSeparator() + "3 - Residential");
    }

    public static float getFloatValue() throws IOException {
        return Float.parseFloat(READER.readLine());
    }
}