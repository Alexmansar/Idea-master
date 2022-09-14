package com.alexmansar.homework.lesson12.family;

import com.alexmansar.helper.Helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FamilyCreate {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Helper.print("Enter child name");
        String childName = Helper.getString();
        Helper.print("Enter mother name");
        String motherName = Helper.getString();
        Helper.print("Enter father name");
        String fatherName = Helper.getString();
        Person mother = new Person(motherName);
        Person father = new Person(fatherName);
        Person family = new Person(childName, mother, father);

        System.out.println("First family is:" + family);
        Person mother2 = new Person(createMother());
        Person father2 = new Person(createFather());
        Person family2 = new Person(Person.generationName(), mother2, father2);
        System.out.println("Second family is:" + family2);

    }

    private static String createFather() {
        return Person.generationName(0);
    }

    private static String createMother() {
        return Person.generationName(1);
    }
}
