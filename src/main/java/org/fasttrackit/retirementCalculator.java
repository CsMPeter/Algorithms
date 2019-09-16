package org.fasttrackit;

import java.util.Scanner;

public class retirementCalculator {

    public static void main(String[] args) {

        int currentAge;
        int retirementAge;
        System.out.println("What is your current age? ");
        Scanner scanner = new Scanner(System.in);
        currentAge = scanner.nextInt();
        System.out.println("At what age would you like to retire? ");
        retirementAge = scanner.nextInt();

        System.out.println("You have " + (retirementAge-currentAge) +
                " years left until you can retire");

        int currentYear = 2019;

        if((retirementAge - currentAge) > 0)
        System.out.println("It's " + currentYear + ", " +
                "so you can retire in " + (currentYear + retirementAge - currentAge));
        else
            System.out.println("You can retire!");
    }

}
