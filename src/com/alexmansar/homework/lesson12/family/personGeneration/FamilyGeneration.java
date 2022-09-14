package com.alexmansar.homework.lesson12.family.personGeneration;

import com.alexmansar.helper.Helper;


import java.io.IOException;

import static com.alexmansar.homework.lesson12.family.personGeneration.Person.getString;


public class FamilyGeneration {
    public static void main(String[] args) throws IOException {
        Helper.print("Enter number of Generation");
        int numberOfGeneration = Integer.parseInt(Person.READER.readLine());
        if (Person.isValid(numberOfGeneration)) return;
        getString(getString(), numberOfGeneration);
    }
}