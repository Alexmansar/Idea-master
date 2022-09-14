package com.alexmansar.classwork.lesson12;

public class Person {
public static final String DEFAULT_NAME = "Unknown";
public static int COUNT = 0;
private final String name;
private int age;

    public Person(int age) {
        this.name = DEFAULT_NAME;
        this.age = age;
        COUNT++;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        secretAction();
        COUNT++;
    }

    static void printCount() {
        System.out.println("count: " + COUNT);

    }

    private void secretAction() {
        System.out.println("secret");
        printCount();
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person name = " + name + " , age = " + age;
    }
}