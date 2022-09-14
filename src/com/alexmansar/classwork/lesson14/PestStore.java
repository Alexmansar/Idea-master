package com.alexmansar.classwork.lesson14;

import java.util.ArrayList;
import java.util.List;

import static com.alexmansar.classwork.lesson14.Animal.DEFAULT_COLOUR;

public class PestStore {

    public static void main(String[] args) {
        Animal cat = new Cat(DEFAULT_COLOUR, "Siam");
//        cat.speak();
        Animal cat2 = new Cat("Ginger", "no");
        Animal dog = new Dog();
        //      dog.speak();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(cat2);
        animals.add(new Rat("multi"));

        handleAnimals(animals);


    }

    static void handleAnimals(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.speak();

            if (animal instanceof Rat) {
                Rat rat = (Rat) animal;
                rat.steal();
            }
        }
    }
}