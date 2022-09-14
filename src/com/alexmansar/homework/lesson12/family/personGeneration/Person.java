package com.alexmansar.homework.lesson12.family.personGeneration;


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
        String mom = mother != null ? "" + mother.name : "";
        String dad = father != null ? "" + father.name : "";
        return "Child name is " + name +
                ", mother name is " + mom +
                ", father name is " + dad;
    }

    public static int findSex(String name) {
        int sex = 0;
        if (name.equals("Alex") || name.equals("Ben") || name.equals("Maksim") || name.equals("Egor") || name.equals("Simon")) {
        } else {
            sex = 1;
        }
        return sex;
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

    public static boolean isValid(int numberOfGeneration) {
        if (numberOfGeneration <= 0) {
            System.out.println("Enter number more than 0");
        } else {
            return false;
        }
        return true;
    }


    public static String getString() {
        String childName = Person.generationName();
         Person mother = new Person(createMother());
        Person father = new Person(createFather());
        Person family = new Person(childName,mother, father);
        System.out.println("N1 family is: " + family);
        return childName;
    }


    public static void getString(String name, int number) {
        String[] names = new String[number];
        names[0] = name;
        for (int i = 1; i < names.length; i++) {
            names[i] = Person.generationName();
            int sex = Person.findSex(names[i - 1]);
             Person mother = new Person(createMother(sex, names[i - 1]));
            Person father = new Person(createFather(sex, names[i - 1]));
            Person family = new Person(names[i], mother, father);
            System.out.println("N" + (i + 1) + " family is: " + family);
        }
    }


    public static String createMother(int sex, String childName) {
        String motherName;
        if (sex == 1) {
            motherName = childName;
        } else {
            motherName = Person.generationName(1);
        }
        return motherName;
    }

    public static String createMother() {
        return Person.generationName(1);
    }

    public static String createFather(int sex, String childName) {
        String fatherName;
        if (sex == 0) {
            fatherName = childName;
        } else {
            fatherName = Person.generationName(0);
        }
        return fatherName;
    }


    public static String createFather() {
        return Person.generationName(0);
    }

}