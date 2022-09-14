package com.alexmansar.classwork.lesson6;

public class Castle {
    public static void main(String[] args) {
        int start = 1000;
        int end = 1500;
        int distance = 1200;
        isHit(start, end, distance);
        boolean result=isHit(start,end,distance);
        System.out.println("попал? - " +result);
        System.out.println("попал? - " +isHit2(600,1000,1200));
        System.out.println("попал? - " +isHit2(600,1000,800));
        System.out.println("попал? - " +isHit2(600,1000,500));
    }

    private static boolean isHit(int start, int end, int distance) {
        if (distance > start && distance < end) {
            return true;
        } else {
            return false;

        }
    }

        private static boolean isHit2 ( int start, int end, int distance){
            if (distance < start || distance > end) {
                return false;
            } else {
                return true;
            }


        }

}
