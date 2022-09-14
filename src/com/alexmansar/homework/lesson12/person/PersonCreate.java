package com.alexmansar.homework.lesson12.person;

import com.alexmansar.helper.Helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonCreate {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Helper.print("Enter number of person");
        int numberOfPerson = Helper.getIntegerValue();
        generatePerson(numberOfPerson);
    }

    public static void generatePerson(int numberOfPerson) {
        Person[] person = new Person[numberOfPerson];
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person();
            Helper.print("№" + (i + 1) + " " + person[i]);
        }
        Helper.print("Man is: " + Person.MAN);
        Helper.print("Woman is: " + Person.WOMAN);
    }
}