package com.company;

public class Main {

    public static void main(String[] args) {

        printRange(500,150);
    }

    private static void printRange (int trailerWeight, int cargoWeight) {

        System.out.println("Trailer Weight: " + trailerWeight);
        System.out.println("Cargo Weight: " + cargoWeight);

        int combinedWeight = cargoWeight + trailerWeight;
        System.out.println("Your combined weight is: " + combinedWeight);

        double min = combinedWeight * 0.09;
        double max = combinedWeight * 0.15;

        System.out.println("Your tongue weight must be between: " + min + " and " + max);

    }
}
