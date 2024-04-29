package logicalAndComparisonOperatorsChallenge;

import logicalAndComparisonOperatorsChallenge.weightGuru.WeightGuru;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double weight = 0;
        double height = 0;

        //Create instance of a Scanner object
        //Use 'System.in' connects to the keyboard to capture user input when the system executes

        Scanner scanner = new Scanner(System.in);

        // Ask for the user's weight
        WeightGuru.askForWeight();
        weight = scanner.nextDouble();

        // Ask for the user's height
        WeightGuru.askForHeight();
        height = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);
        double roundedBMI = Math.round(bmi * 10.0) / 10.0;

        // Display the result
        WeightGuru.results(roundedBMI);

        // Calculate the BMI result
        if (bmi < 18.5) {
            WeightGuru.underweight();
        } else if (bmi < 25) {
            WeightGuru.normalWeight();
        } else if (bmi < 30) {
            WeightGuru.overweight();
        } else {
            WeightGuru.obese();
        }
    }
}