package org.fasttrackit;

import java.util.Scanner;

public class Exercises {

    public void AreaOfARectangularRoom() {

        int lengthInFeet;
        int widthInFeet;

        System.out.println("What is the length of the room in feet?");
        Scanner scanner = new Scanner(System.in);
        lengthInFeet = scanner.nextInt();
        System.out.println("What is the width of the room in feet?");
        widthInFeet = scanner.nextInt();
        System.out.println("You entered dimensions of " + lengthInFeet +
                " by " + widthInFeet + " feet.");
        System.out.println("The area is " + (lengthInFeet * widthInFeet) +
                " square feet " + (lengthInFeet * widthInFeet * 0.09290304) +
                " square meters.");

    }


    public void CozaLozaWoza(int x, int n) {


        for (int i = x; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(" CozaLoza ");
            else if (i % 3 == 0 && i % 7 == 0)
                System.out.print(" CozaWoza ");
            else if (i % 5 == 0 && i % 7 == 0)
                System.out.print("LozaWoza ");
            else if (i % 3 == 0)
                System.out.print(" Coza ");
            else if (i % 5 == 0)
                System.out.print(" Loza ");
            else if (i % 7 == 0)
                System.out.print(" Woza ");
            else
                System.out.print(i + " ");
            if (i % 11 == 0)
                System.out.println();

        }


    }


    public void CozaLozaWoza1(int x, int n) {


        for (int i = x; i <= n; ) {
            for (int j = 1; j <= 11; j++, i++) {
                if (i % 3 == 0 && i % 5 == 0)
                    System.out.print(" CozaLoza ");
                else if (i % 3 == 0 && i % 7 == 0)
                    System.out.print(" CozaWoza ");
                else if (i % 5 == 0 && i % 7 == 0)
                    System.out.print("LozaWoza ");
                else if (i % 3 == 0)
                    System.out.print(" Coza ");
                else if (i % 5 == 0)
                    System.out.print(" Loza ");
                else if (i % 7 == 0)
                    System.out.print(" Woza ");
                else
                    System.out.print(i + " ");
            }

            System.out.println();

        }}



        public void Coza(int i){
            for (int j = 1; j <= 11; j++,i++) {
                if (i % 3 == 0 && i % 5 == 0)
                    System.out.print(" CozaLoza ");
                else if (i % 3 == 0 && i % 7 == 0)
                    System.out.print(" CozaWoza ");
                else if (i % 5 == 0 && i % 7 == 0)
                    System.out.print("LozaWoza ");
                else if (i % 3 == 0)
                    System.out.print(" Coza ");
                else if (i % 5 == 0)
                    System.out.print(" Loza ");
                else if (i % 7 == 0)
                    System.out.print(" Woza ");
                else
                    System.out.print(i + " ");
            }
        }
    public void Count(int x,int n){

        for (int i = x; i <= n; i = i + 11)
        {
            Coza(i);
            System.out.println();
        }

    }


    }
