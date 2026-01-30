/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodepractice;

import java.util.Scanner;

/**
 *
 * @author Ayabonga Yawa
 */
public class PasswordValidation {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("""
                            1.Password must be atleast 8 characters 
                            2.Password must consist of letters and digits 
                            3.Password must contain atleast two didgits
                           """);
        
        System.out.println("Enter the password here: ");
        String pass = in.nextLine();
        
       
       
    if (isValidPassword(pass)) {
            System.out.println("Password is VALID.");
        } else {
            System.out.println("Password is INVALID.");
        }

        in.close();
    }

   
    // This method checks whether a password meets all validation rules.
    
    public static boolean isValidPassword(String password) {

        // Check minimum length
        if (password.length() < 8) {
            return false;
        }

        // Boolean flags to track required conditions
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        // Loop through each character in the password
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // Check for uppercase letter
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
            // Check for lowercase letter
            else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            }
            // Check for digit
            else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        // Password is valid only if ALL conditions are met
        return hasUppercase && hasLowercase && hasDigit;
    }
}