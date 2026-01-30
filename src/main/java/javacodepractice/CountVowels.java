/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodepractice;

import java.util.Scanner;

/**
 * Program that counts the Vowels within a string.
 *
 * @author Ayabonga Yawa 26 Jan 2026
 */
public class CountVowels {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = scanner.nextLine();

        int vowelCount = 0;
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);

            if (character == 'a' || character == 'e' || 
                character == 'i' || character == 'o' || 
                character == 'u') {
                
                vowelCount++;
            }

        }
        
            System.out.println("The number of vowels in " + input + " is " + vowelCount);
            
            scanner.close();
    }
}
