package com.alexmansar.homework.lesson15.tripleConvertor;

public class Celsius extends Temperature {

    public static float calculateTemperatureCelsiusToKelvin(float temperature, float kelvinConst) {
        return  (temperature + kelvinConst);
    }

    public static float calculateTemperatureCelsiusToFahrenheit(float temperature, float kelvinConst, float fahrenheitCoefficient, int fahrenheitConst){
        return  (temperature*fahrenheitCoefficient+fahrenheitConst);
    }
}
