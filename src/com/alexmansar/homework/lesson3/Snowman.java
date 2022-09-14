package com.alexmansar.homework.lesson3;

public class Snowman {
    public static void main(String[] args) {

        float x = 0.2f;
        float r1 = x;
        float r2 = 2.5f * x;
        float r3 = 5 * x;
        float p = 0.7f;
        // вариант 1
        float m1 = (float) (p * ((float) 4 / 3 * Math.PI * (Math.pow(r1, 3) + Math.pow(r2, 3) + Math.pow(r3, 3))));
        System.out.println("m1=" + m1 + "kg");
        // вариант 2
        float v1 = (float) (((float) 4 / 3 * Math.PI * Math.pow(r1, 3)));
        float v2 = (float) ((float) 4 / 3 * Math.PI * Math.pow(r2, 3));
        float v3 = (float) ((float) 4 / 3 * Math.PI * Math.pow(r3, 3));
        float m2 = p * (v1 + v2 + v3);
        System.out.println("m2=" + m2 + "kg");

        float M1 = calcMass(0.2f, 0.7f);
        float M2 = calcMass(0.5f, 0.7f);
        float M3 = calcMass(1, 0.7f);
        System.out.println("m3=" + calcVolume(M1, M2, M3) + "kg");
    }

    //3 вариант
    public static float calcMass(float r, float p) {
        float M = (float) (p * (float) 4 / 3 * Math.PI * Math.pow(r, 3));
        return M;
    }

    public static float calcVolume(float M1, float M2, float M3) {
        float M = (M1 + M2 + M3);
        return M;
    }


}



