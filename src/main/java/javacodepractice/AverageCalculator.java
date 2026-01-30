
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodepractice;
import java.util.Scanner;
/**
 * Program that calculates the average of three numbers.
 * @author Ayabonga Yawa
 * 23 Jan 2026
 */
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        double average = (num1 + num2 + num3) / 3;
        System.out.println("The average is: " + average);

        scanner.close();
    }
}
