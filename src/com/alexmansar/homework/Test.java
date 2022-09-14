package com.alexmansar.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

public static final BufferedReader READER=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {


        choseMedicalService();

    }

    public static int choseMedicalService() throws IOException {
        int medicalServiceType=validateType();
        return medicalServiceType;

    }

    public static int validateType() {
        try {
            int numberOfType = Integer.parseInt(READER.readLine());
            if (numberOfType > 3 || numberOfType < 0) {
                System.out.println("Enter correct value");
                return validateType();
            } else {
                return numberOfType;
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("Use only numbers");
            return validateType();
        }
    }
}
