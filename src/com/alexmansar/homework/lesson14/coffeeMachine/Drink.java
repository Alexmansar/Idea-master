package com.alexmansar.homework.lesson14.coffeeMachine;

public class Drink {
    protected String nameOfDrink;
    protected float price;

    public Drink(String nameOfDrink, float prise) {
        this.nameOfDrink = nameOfDrink;
        this.price = prise;
    }

    public String getNameOfDrink() {
        return nameOfDrink;
    }

    @Override
    public String toString() {
        return "Your choice is " + nameOfDrink + ", prise =" + price + " UAH";
    }

    public void prepare() {
        System.out.println(nameOfDrink + " making");
    }

    public float getPrice() {
        return price;
    }

}
