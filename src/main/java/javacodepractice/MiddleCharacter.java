/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodepractice;

import java.util.Scanner;

/**
 * Program that finds the middle character(s) of a string.
 * @author Ayabonga Yawa
 * 26 Jan 2026
 */
public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int position;
        int length;

        if (input.length() % 2 == 0) {
            position = input.length() / 2 - 1;
            length = 2;
        } else {
            position = input.length() / 2;
            length = 1;
        }

        String middle = input.substring(position, position + length);
        System.out.println("The middle character(s): " + middle);

        scanner.close();
    }
}
