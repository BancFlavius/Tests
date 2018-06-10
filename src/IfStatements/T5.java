package IfStatements;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Your height in m: ");
        double height = input.nextDouble();
        System.out.print("Your weight in kg: ");
        double weight = input.nextDouble();

        double bmi = weight / (height*height);

        if(bmi <= 15.0) {
            System.out.println("Youre BMI is " + bmi);
            System.out.println("BMI Category very severely underweight");
        } else if ( bmi > 15.0 && bmi < 16.0 ) {
            System.out.println("Youre BMI is " + bmi);
            System.out.println("BMI Category severely underweight");
        } else if ( bmi > 16.1 && bmi < 18.4 ) {
            System.out.println("Youre BMI is " + bmi);
            System.out.println("BMI Category underweight");
        } else if ( bmi > 18.5 && bmi < 24.9 ) {
            System.out.println("Youre BMI is " + bmi);
            System.out.println("BMI Category normal weight");
        } else if ( bmi > 25.0 && bmi < 29.9 ) {
            System.out.println("Youre BMI is " + bmi);
            System.out.println("BMI Category overweight");
        } else if ( bmi > 30.0 && bmi < 34.9 ) {
            System.out.println("Youre BMI is " + bmi);
            System.out.println("BMI Category moderately obese");
        } else if ( bmi > 35.0 && bmi < 39.9 ) {
            System.out.println("Youre BMI is " + bmi);
            System.out.println("BMI Category severely obese");
        } else if ( bmi > 40.0) {
            System.out.println("Youre BMI is " + bmi);
            System.out.println("BMI Category very severely/morbidly underweight");
        } else {
            System.out.println("THERE WAS AN ERROR, TRY AGAIN.");
        }
    }
}
