package com.alexmansar.homework.lesson4;

public class Zoo {
    public static void main(String[] args) {
        calculateAnimals("Zebra", 30, 1.1f);
        calculateAnimals("Elephant", 3, 1.15f);
        calculateAnimals("Giraffe", 8, 1.5f);
        calculateAnimals("Beers", 20, 1.3f);
    }

    public static void calculateAnimals(String name, float animal, float growth) {
        System.out.println(name + "= " + (float) Math.round(animal * growth));


    }
}
