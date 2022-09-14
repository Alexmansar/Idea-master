package com.alexmansar.classwork.lesson6;

public class StringText {
    public static void main(String[] args) {
        String s1 = "Text";
        String s2 = s1;
        String s3 = "text";
        System.out.println(s1);
        System.out.println(s1.hashCode());

        System.out.println(s2);
        System.out.println(s2.hashCode());
        System.out.println(s3);
        System.out.println(s3.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println("Text".equals(s3));

        boolean a=s1.equals(s2);
    }
}
