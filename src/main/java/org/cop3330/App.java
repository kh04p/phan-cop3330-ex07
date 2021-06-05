/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

import java.util.Scanner;

//program to find area and convert result from feet to meters or vice versa.
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        final double factor = 0.09290304; //conversion factor
        System.out.print("Choose \"F\" to enter values in feet or \"M\" to enter values in meters: ");
        String choice = input.nextLine().toLowerCase(); //user choice to enter value in meters or feet

        double len, width, roomArea, convertedArea;

        switch (choice) { //performs calculations based on user choice
            case "f":
                System.out.print("What is the length of the room in feet? ");
                len = input.nextDouble();
                System.out.print("What is the width of the room in feet? ");
                width = input.nextDouble();
                roomArea = area.calculate(len, width);
                convertedArea = area.convertToMeters(roomArea, factor);
                System.out.printf("The room is%n%.2f square feet%n%.2f square meters.", roomArea, convertedArea);
                break;
            case "m":
                System.out.print("What is the length of the room in meters? ");
                len = input.nextDouble();
                System.out.print("What is the width of the room in meters? ");
                width = input.nextDouble();
                roomArea = area.calculate(len, width);
                convertedArea = area.convertToFeet(roomArea, factor);
                System.out.printf("The room is%n%.2f square meters%n%.2f square feet.", roomArea, convertedArea);
                break;
            default:
                System.out.println("Incorrect option. Please try again.");
                break;
        }
    }
}
