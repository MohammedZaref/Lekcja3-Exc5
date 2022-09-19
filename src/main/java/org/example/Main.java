package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // CREATE A METHOD TO CHECK IF GIVEN VALUSE OF 3 SIDES OF TRIANGLES WILL RESULT A TRIANGLE WITH AN RIGHT ANGLE
        // BASED ON PYTHAGOREAN THEOREM IF THE SQR OF HYPOTENUSE IS EQUAL TO THE SUM OF THE OTHER TWO SIDES SQR SO THE TRIANGLE IS A RIGHT ANGLE TRIANGLE
        // PYTHAGOREAN EQUATION: A^ = B^2 + C^2


        Scanner sc = new Scanner(System.in);

        System.out.println("Input three integer numbers (Base, Height and Hypotenuse of Triangle) separated with a space: ");
        int[] triangleThreeSides = new int[]{
                sc.nextInt(), sc.nextInt(), sc.nextInt()
        };
    }
}