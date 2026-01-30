/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodepractice;

import java.util.Scanner;

/**
 * Program to count the words in a user entered string.
 * @author Ayabonga Yawa
 * 26 Jan 2026
 */
public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine().trim();
        
        if(input.isEmpty()){
            System.out.println("The number of words is 0");
        }else{
        String [] words = input.split("\\s+");
        System.out.println("The number of words is: "+words.length);
        }
         scanner.close();
         
    }
}
