package com.alexmansar.homework.lesson14.coffeeMachine;

public class Americano extends Drink {
    protected boolean milk;

    public Americano(String nameOfDrink, float price, boolean milk) {
        super(nameOfDrink, price);
        this.milk = milk;
    }

    public void prepare() {
        System.out.println(nameOfDrink + getMilkMessage() + " making");
    }


    public String getMilkMessage() {
        return milk ? " with milk" : "";
    }

    public String toString() {
        return "Your choice is " + nameOfDrink + getMilkMessage() + ", prise =" + price + " UAH";
    }

}
