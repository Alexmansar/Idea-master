package com.alexmansar.homework.lesson14.coffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CoffeeMachine {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final float PRICE_CAPPUCCINO = 20.5F;
    private static final float PRICE_LATTE = 25.3F;
    private static final float PRICE_TEA = 15.0F;
    private static final float PRICE_AMERICANO_WITH_MILK = 22.2F;
    private static final float PRICE_AMERICANO_WITHOUT_MILK = 20.2f;

    public static void main(String[] args) throws IOException {

        ArrayList<Drink> drinks = new ArrayList<>();
        printMenu();
        while (!READER.readLine().equalsIgnoreCase("stop")) {
            try {
                Drink drink = createDrink();
                drinks.add(drink);
                drink.prepare();
                System.out.println("Do you want anything else? For choice, please, enter any butt. If the choice is over, please, click -STOP");
            } catch (IllegalArgumentException e) {
                System.out.println("incorrect value");
            }
        }
        printOrderPrice(drinks);
    }

    private static void printOrderPrice(ArrayList<Drink> drinks) {
        float orderPrice = 0;
        for (Drink drink : drinks) {
            orderPrice += drink.getPrice();
            System.out.println(drink);
        }
        System.out.println("The price of your order:  " + orderPrice + " UAH");
    }

    public static Drink createDrink() throws IOException {
        Drink drink;
        switch (choiceDrink()) {
            case 1 -> drink = new Americano("Americano", PRICE_AMERICANO_WITHOUT_MILK, false);
            case 2 -> drink = new Americano("Americano", PRICE_AMERICANO_WITH_MILK, true);
            case 3 -> drink = new Cappuccino("Cappuccino", PRICE_CAPPUCCINO);
            case 4 -> drink = new Latte("Latte", PRICE_LATTE);
            case 5 -> drink = new Tea("Black Tea", PRICE_TEA);
            case 6 -> drink = new Tea("Green Tea", PRICE_TEA);
            default -> {
                System.out.println("Value might be for 1 to 6");
                drink = createDrink();
            }
        }
        return drink;
    }

    public static void printMenu() {
        System.out.println("Choose a drink to prepare or click - STOP. For start, please, enter any butt" +
                System.lineSeparator() + "1 - Americano - " + PRICE_AMERICANO_WITHOUT_MILK + "UAH" +
                System.lineSeparator() + "2 - Americano with milk - " + PRICE_AMERICANO_WITH_MILK + "UAH" +
                System.lineSeparator() + "3 - Cappuccino - " + PRICE_CAPPUCCINO + "UAH" +
                System.lineSeparator() + "4 - Latte - " + PRICE_LATTE + "UAH" +
                System.lineSeparator() + "5 - Black tea - " + PRICE_TEA + "UAH" +
                System.lineSeparator() + "6 - Green tea - " + PRICE_TEA + "UAH");
    }

    public static int choiceDrink() throws IOException {
        return Integer.parseInt(READER.readLine());
    }
}