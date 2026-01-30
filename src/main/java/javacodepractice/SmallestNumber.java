
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodepractice;
import java.util.Scanner;
/**
 * Program that finds the smallest of three numbers 
 * @author Ayabonga Yawa
 * 23 Jan 2026
 */
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        int smallest = Math.min(Math.min(num1, num2), num3);
        System.out.println("The smallest number is: " + smallest);

        scanner.close();
    }
}
