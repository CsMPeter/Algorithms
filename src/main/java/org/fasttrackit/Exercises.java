package org.fasttrackit;

import java.util.Scanner;

public class Exercises {

    public void AreaOfARectangularRoom(){

        int lengthInFeet;
        int widthInFeet;

        System.out.println("What is the length of the room in feet?");
        Scanner scanner = new Scanner(System.in);
        lengthInFeet = scanner.nextInt();
        System.out.println("What is the width of the room in feet?");
        widthInFeet = scanner.nextInt();
        System.out.println("You entered dimensions of " + lengthInFeet +
                " by " + widthInFeet + " feet.");
        System.out.println("The area is " + (lengthInFeet*widthInFeet) +
                " square feet " + (lengthInFeet*widthInFeet*0.09290304) +
                " square meters.");

    }



}
