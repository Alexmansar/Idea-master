package com.alexmansar.classwork.lesson8;

public class ArrayLink {
    public static void main(String[] args) throws InterruptedException {
        String[] strings = new String[3];

        fillArray(strings);
        printArray(strings);
        System.out.println("strings link "+strings);
        String [] another=strings;
        System.out.println("another link "+another);
        another[0]="new text0";
        System.out.println(strings[0]);
        System.out.println(another[0]);

        String[] newStrings =createAndFill(10);
        printArray(newStrings);
    }

    public static void printArray(String[] strings) {
        for (String string : strings) System.out.println(string);
    }
    public static void fillArray (String [] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i]="str "+ i;
        }
    }
    public static String[] createAndFill(int size) {
        String[]strings=new String[size];
        fillArray(strings);
        return strings;
    }
}
