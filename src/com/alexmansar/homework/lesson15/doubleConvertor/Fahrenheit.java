package com.alexmansar.homework.lesson15.doubleConvertor;

public class Fahrenheit implements Converter {
    private static final float FAHRENHEIT_COEFFICIENT = 9 / 5f;
    private static final int FAHRENHEIT_CONST = 32;

    @Override
    public float convert(float temperatureCelsius) {
        return (temperatureCelsius*FAHRENHEIT_COEFFICIENT+FAHRENHEIT_CONST);
    }
}
