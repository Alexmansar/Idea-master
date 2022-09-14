package com.alexmansar.homework.lesson15.doubleConvertor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureConverter implements Converter {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        System.out.println("Enter temperature of Celsius degree");
        convert();
    }

    private static void convert() throws IOException {
        float temperatureCelsius = Float.parseFloat(READER.readLine());
        System.out.println("""
                Chose type yo convert\s
                1-Kelvin\s
                2-Fahrenheit""");
        int typeToConvert = Integer.parseInt(READER.readLine());
        createConverter(typeToConvert);
        System.out.println("Your result is " + createConverter(typeToConvert).convert(temperatureCelsius) + addTypeOfDegree(typeToConvert));
    }

    public static Converter createConverter(int typeToConvert) {
        return
                switch (typeToConvert) {
                    case 1 -> new Kelvin();
                    case 2 -> new Fahrenheit();
                    default -> throw new IllegalStateException("Unexpected value: " + typeToConvert);

                };
    }

    public static String addTypeOfDegree(int typeToConvert) {
        return
                switch (typeToConvert) {
                    case 1 -> "K";
                    case 2 -> "F";
                    default -> throw new IllegalStateException("Unexpected value: " + typeToConvert);

                };
    }

    @Override
    public float convert(float temperatureCelsius) {
        return 0;
    }
}