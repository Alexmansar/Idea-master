package com.alexmansar.homework.lesson11;

import java.util.Objects;

public class Cat {
    String name;
    Integer age;
    Double weight;
    String breed;

    public Cat() {
        System.out.println("Hello. let's create a cats family. start with mom");;
    }

    public Cat(String name, Integer age, Double weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            return Objects.equals(this.weight, cat.weight) && this.age.equals(cat.age);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", weight=" + this.weight +
                ", breed='" + this.breed + '\'' +
                '}';
    }
}