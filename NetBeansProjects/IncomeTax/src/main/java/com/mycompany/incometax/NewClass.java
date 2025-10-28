package com.mycompany.incometax;
import java.util.Scanner;
public class NewClass {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter a number you want to enter: ");
            int count = scanner.nextInt();
            int sum = 0;
            
            for ( int i = 1; i <= count; i++) {
                System.out.print("Enter Number " + i + ": ");
                int number = scanner.nextInt();
                
            sum += number;
            }
            System.out.println("The total sum is: " + sum);
            scanner.close();
        }
}