package com.alexmansar.classwork.lesson14;

public class Dog extends Animal {

    public Dog(){
        super("black");
    }
    @Override
    public void speak() {

        System.out.println("gav-gav");
        action();
    }
    private void action(){
        System.out.println("Виляет хвостиком");
    }
}
