package com.alexmansar.homework.lesson15.doubleConvertor;

public class Kelvin implements Converter {
    private static final float KELVIN_CONST=273.15f;

    @Override
    public float convert(float temperatureCelsius) {
        return (temperatureCelsius+KELVIN_CONST);
    }
}
