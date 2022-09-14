package com.alexmansar.classwork.lesson4;

import java.util.Scanner;

public class Box {
    public static void main(String[] args) {
        //рассчитать объем коробки width, height,depth
        Scanner scanner=new Scanner(System.in);

        System.out.println("Input w,h,d");
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int d = scanner.nextInt();

        int volume = volume(h, w, d);
        System.out.println(volume);
        System.out.println("V=" + volume(345, 666, 344));


    }

    public static int volume(int h, int w, int d) {
        return h * w * d;
    }

}
