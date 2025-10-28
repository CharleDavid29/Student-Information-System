/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test1;
import java.util.Scanner;
public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many number you want to enter: ");
        int count = scanner.nextInt();
        int sum = 0;
        
        for ( int i = 1; i <= count; i++) {
            System.out.print("The number you enter is"+ i + ": ");
            int number = scanner.nextInt();
            
            sum += number;
        }
        System.out.println("The sum is: " + sum);
        
        scanner.close();
    }
}
