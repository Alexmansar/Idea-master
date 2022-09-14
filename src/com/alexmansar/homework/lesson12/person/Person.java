package com.alexmansar.homework.lesson12.person;

public class Person {
    private static final String[] MEN_NAMES = {"Alex", "Ben", "Maksim", "Egor", "Simon", "Liam", "Mason", "Michael"};
    private static final String[] WOMEN_NAMES = {"Julia", "Sarah", "Kaila", "Scarlett", "Megan", "Sofia", "Olivia", "Mia"};
    private static final String[] SURNAMES = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor"};
    public static int MAN = 0;
    public static int WOMAN = 0;
    private final String name;
    private final String surname;
    int age;
    int weight;
    int height;


    @Override
    public String toString() {
        return "Person " +
                "name=" + name +
                ", surname=" + surname +
                ", age=" + age +
                ", weight=" + weight + "kg" +
                ", height=" + height + "sm";
    }

    public Person() {
        this.name = generationName();
        this.surname = getSurname();
        this.age = getAge();
        this.weight = getWeight();
        this.height = getHeight();
    }

    public Person(String name, String surname, int weight) {
        this.name = name;
        this.surname = surname;
        this.weight = weight;
    }


    private static int generationSex() {
        return (int) (Math.random() * 2);
    }

    public static String generationName() {
        String name = null;
        switch (generationSex()) {
            case 0 -> {
                name = MEN_NAMES[(int) (Math.random() * MEN_NAMES.length)];
                MAN++;
            }
            case 1 -> {
                name = WOMEN_NAMES[(int) (Math.random() * WOMEN_NAMES.length)];
                WOMAN++;
            }
        }
        return name;
    }

    public static String getSurname() {
        String surname;
        int number = (int) (Math.random() * SURNAMES.length);
        surname = SURNAMES[number];
        return surname;
    }

    public static int getAge() {
        int minAge = 20;
        int maxAge = 80;
        return (int) (Math.random() * (maxAge - minAge) + minAge);
    }

    public static int getWeight() {
        int minWeight = 50;
        int maxWeight = 100;
        return (int) (Math.random() * (maxWeight - minWeight) + minWeight);
    }

    public static int getHeight() {
        int minHeight = 140;
        int maxHeight = 200;
        return (int) (Math.random() * (maxHeight - minHeight) + minHeight);
    }
}