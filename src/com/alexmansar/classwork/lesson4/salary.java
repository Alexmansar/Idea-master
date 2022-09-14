package com.alexmansar.classwork.lesson4;

public class salary {
    public static void main(String[] args) {
        float em1 = 3000f;
        float em2 = 4500f;
        float em3 = 5800f;
        float y = 10 * 12.0f;
        float s1 = em1 * y;
        float s2 = em2 * y;
        float s3 = em3 * y;
        float sc1 = s1 * 0.95f;
        float sc2 = s2 * 0.95f;
        float sc3 = s3 * 0.95f;
        float S = (sc1 + sc2 + sc3) / 3;
        float e1 = sc1 / y;
        float e2 = sc2 / y;
        float e3 = sc3 / y;
        System.out.println("s1=" + s1);
        System.out.println("s2=" + s2);
        System.out.println("s3=" + s3);
        System.out.println("sc1=" + sc1);
        System.out.println("sc2=" + sc2);
        System.out.println("sc3=" + sc3);
        System.out.println("S=" + S);
        System.out.println("e1=" + e1);
        System.out.println("e2=" + e2);
        System.out.println("e3=" + e3);


    }
}
