/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author netwa
 */
public class JavaApplication2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first value.");
            double a = scanner.nextDouble();
        System.out.println("Please enter your second value.");
            double b = scanner.nextDouble();
        System.out.println("Please select an Arithmetic operators.");
        System.out.println("Type + - * / to select.");
        String c = scanner.next();
        scanner.close();
        calculator(a, b, c);
    }

    public static void calculator(double a, double b, String c){
        switch (c) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Error"); // :( :( :( :(
        }
    }
}