package logicalAndComparisonOperatorsChallenge.weightGuru;

public class WeightGuru {

    public static void askForWeight() {
        System.out.println("Enter your weight in kilograms: ");
    }

    public static void askForHeight() {
        System.out.println("Enter your height in meters: ");
    }

    public static void underweight() {
        System.out.println("You are underweight.");
    }

    public static void normalWeight() {
        System.out.println("You are at a normal weight.");
    }

    public static void overweight() {
        System.out.println("You are overweight.");
    }

    public static void obese() {
        System.out.println("You are obese.");
    }

    public static void results(double bmi) {
        System.out.println("*----Your BMI Results----*");
        System.out.println("Your Body Mass Index (BMI) is: " + bmi);
    }
}
