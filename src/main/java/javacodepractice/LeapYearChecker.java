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
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        
        boolean a = (year %4) ==0;
        boolean b = (year % 100) !=0;
        boolean c = (year % 400)==0 && (year % 100)==0;
        
        if(a == true || c== true){
            System.out.println(year+ " is a leap year");
        }else if(b == true ){
            System.out.println(year+" is not a leap year");
        }
        
        
    }
    
}
