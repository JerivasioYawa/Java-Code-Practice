
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacodepractice;
import javax.swing.JOptionPane;
/**
 * Demonstrates user input using JOptionPane dialogs.
 * @author Ayabonga Yawa
 * 23 Jan 2026
 */
public class JOptionPaneDemo {
       public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        String ageInput = JOptionPane.showInputDialog("Enter your age:");

        int age = Integer.parseInt(ageInput);

        JOptionPane.showMessageDialog(
            null,
            "Hello " + name + ", you are " + age + " years old."
        );
    }
}
