package com.alexmansar.homework.homework3;

public interface MyList {

    void add(int index, String string);

    void add(String string);

    String get(int index);

    int size();

    void set(int index, String string);

    String remove(int index);
}