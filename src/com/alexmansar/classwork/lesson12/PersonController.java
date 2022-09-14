package com.alexmansar.classwork.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonController {
    public static final BufferedReader READER=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String name=PersonController.READER.readLine();

        Person person = new Person(name, 27);
        System.out.println(person);
        processPerson(person);
        System.out.println(person);
        Person person1=new Person(28);
        System.out.println(person1);
        System.out.println("Person count: "+Person.COUNT);
        Person.printCount();
        person1.setAge(42);
        System.out.println(person1.getAge() );
    }

    public static void processPerson(Person person) {
        //   person.age = 33;
    }
}
