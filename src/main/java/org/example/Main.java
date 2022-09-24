package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // CREATE A METHOD TO CHECK IF GIVEN VALUES OF 3 SIDES OF TRIANGLES WILL RESULT A TRIANGLE WITH AN RIGHT ANGLE
        // BASED ON PYTHAGOREAN THEOREM IF THE SQR OF HYPOTENUSE IS EQUAL TO THE SUM OF THE OTHER TWO SIDES SQR SO THE TRIANGLE IS A RIGHT ANGLE TRIANGLE
        // PYTHAGOREAN EQUATION: A^ = B^2 + C^2


        Scanner sc = new Scanner(System.in);

        System.out.println("Input three integer numbers (Base, Height and Hypotenuse of Triangle) separated with a space: ");
        int[] triangleThreeSides = new int[]{
                sc.nextInt(), sc.nextInt(), sc.nextInt()
        };
        Arrays.sort(triangleThreeSides);

        boolean isRightContainer = PythagoreanTheorem.isRight(triangleThreeSides[0], triangleThreeSides[1], triangleThreeSides[2]);
        if (isRightContainer) {
            System.out.println("The Triangle has a Right Angle");
        } else {
            System.out.println("The Triangle doesn't have any Right Angle");
        }
    }
}