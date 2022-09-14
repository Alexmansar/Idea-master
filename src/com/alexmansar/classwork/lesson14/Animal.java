package com.alexmansar.classwork.lesson14;

public class Animal {

    public static String DEFAULT_COLOUR ="White";
    protected String colour;

    public Animal(String colour) {
        this.colour = colour;
    }

   /* public Animal() {
    }
*/
    public void speak() {
        System.out.print("animal speaks ");
    }

}