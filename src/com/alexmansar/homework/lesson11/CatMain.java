package com.alexmansar.homework.lesson11;

import com.alexmansar.helper.Helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CatMain {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Cat catMom = new Cat();
        Helper.print("Enter name cat");
        catMom.name = Helper.getString();
        Helper.print("How old is your cat?");
        catMom.age = Helper.getIntegerValue();
        if (Helper.isValid(catMom.age)) return;
        Helper.print("Oh, thanks! And what is her weight");
        catMom.weight = Helper.getDoubleValue();
        if (Helper.isValid(catMom.weight)) return;
        Helper.print("And last, what breed is she?");
        catMom.breed = Helper.getString();
        Helper.print("Now we will get the data of the cat's father and a little kitten");
        Cat catDad = new Cat("Tom", 4, 3.5, "Main-coon");
        Cat kitten = new Cat("Darcy", 1);
        Helper.print(String.valueOf(catMom));
        Helper.print(String.valueOf(catDad));
        Helper.print(String.valueOf(kitten));
        boolean catCheck = (catMom.equals(catDad));
        Helper.print(catCheck ? "Cat's are the same age and weight" : "Cat's aren't the same age and weight");
    }
}
