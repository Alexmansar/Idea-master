package com.alexmansar.homework.lesson12.family;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Person {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static String[] MEN_NAMES = {"Alex", "Ben", "Maksim", "Egor", "Simon"};
    public static String[] WOMEN_NAMES = {"Julia", "Sarah", "Kaila", "Scarlett", "Megan", "Sofia", "Olivia", "Mia"};

    String name;
    Person mother;
    Person father;

    public Person(String name) {
        this.name = name;
    }


    public Person(String name, Person mother, Person father) {
        this.name = name;
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        return "Child name is " + name +
                ", mother name is " + mother.name +
                ", father name is " + father.name;
    }

    public static int generationSex() {
        return (int) (Math.random() * 2);
    }

    public static String generationName() {
        return
                switch (generationSex()) {
                    case 0 -> MEN_NAMES[(int) (Math.random() * MEN_NAMES.length)];
                    case 1 -> WOMEN_NAMES[(int) (Math.random() * WOMEN_NAMES.length)];
                    default -> throw new IllegalStateException("Unexpected value: " + generationSex());
                };
    }

    public static String generationName(int sex) {
        return
                switch (sex) {
                    case 0 -> MEN_NAMES[(int) (Math.random() * MEN_NAMES.length)];
                    case 1 -> WOMEN_NAMES[(int) (Math.random() * WOMEN_NAMES.length)];
                    default -> throw new IllegalStateException("Unexpected value: " + generationSex());
                };
    }
}