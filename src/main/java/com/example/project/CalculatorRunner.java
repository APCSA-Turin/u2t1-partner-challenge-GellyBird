package com.example.project;
import java.util.Scanner;


public class CalculatorRunner
 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Calculator calc1 = new Calculator("TI84 Plus");
        System.out.println(calc1.info());
        System.out.println("Enter 2 numbers");
        System.out.print("One: ");
        int n1 = scan.nextInt();
        scan.nextLine();
        System.out.print("Two: ");
        int n2 = scan.nextInt();
        scan.nextLine();
        System.out.print("Choose an operand (*, /, +, -): ");
        String playerOperand = scan.nextLine();
        System.out.println(n1 + " " + playerOperand + " " + n2 + " is " + calc1.performOperation(playerOperand,n1,n2));
        System.out.println("As a coordinate pair, your numbers are " + calc1.coordinatePair(n1,n2));
        System.out.println(n1 + " is evenly divisible by " + n2 + ": " + calc1.divisibleBy(n1, n2));
        System.out.println("The absolute value of " + n1 + " - " + n2 + " is: " + calc1.absoluteValue(n1,n2));  
    }
}
