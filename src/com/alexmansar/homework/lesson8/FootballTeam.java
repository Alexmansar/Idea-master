package com.alexmansar.homework.lesson8;

public class FootballTeam {
    public static void main(String[] args) {
        int players = 11;
        int teamNumber1 = 1;
        int teamNumber2 = 2;
        int minAge = 18;
        int maxAge = 45;
        System.out.print("Age " + teamNumber1 + " team is: ");
        int[] agesTeam1 = generateAge(players, minAge, maxAge);
        System.out.println();
        System.out.print("Age " + teamNumber2 + "  team is: ");
        int[] agesTeam2 = generateAge(players, minAge, maxAge);
        double averageAgeTeam1 = calcAverageAge(agesTeam1, teamNumber1);
        double averageAgeTeam2 = calcAverageAge(agesTeam2, teamNumber2);
        System.out.println();
        System.out.println("Average age of team number " + teamNumber1 + " is " + averageAgeTeam1 / agesTeam1.length);
        System.out.println("Average age of team number " + teamNumber2 + " is " + averageAgeTeam2 / agesTeam2.length);
        calcLargerAverageAge(averageAgeTeam1, averageAgeTeam2);
    }

    private static int[] generateAge(int players, int minAge, int maxAge) {

        int[] ageTeam = new int[players];
        for (int i = 0; i < ageTeam.length; i++) {
            int age = (int) (Math.random() * (maxAge - minAge) + minAge);
            ageTeam[i] = age;

            System.out.print(age + ", ");
        }
        return ageTeam;
    }

    public static double calcAverageAge(int[] age, int teamNumber) {
        int averageAge = 0;
        for (int j : age) {
            averageAge = averageAge + j;
        }
        return averageAge;
    }

    public static void calcLargerAverageAge(double averageAge1, double averageAge2) {
        if (averageAge1 > averageAge2) {
            System.out.println("Average age of the first team is larger then second team ");
        } else if (averageAge2 > averageAge1) {
            System.out.println("Average age of the second team is larger then first team ");
        } else {
            System.out.println("The average age of the teams is the same");
        }
    }
}