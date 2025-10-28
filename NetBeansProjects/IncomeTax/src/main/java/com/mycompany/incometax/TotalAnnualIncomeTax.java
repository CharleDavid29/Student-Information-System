package com.mycompany.incometax;
import java.util.Scanner;
public class TotalAnnualIncomeTax {

    public static void main(String[] args) {
        
        Scanner myscan = new Scanner(System.in);
        
        System.out.println("Enter Your Status");
        System.out.println("1. Single");
        System.out.println("2. Married");
        System.out.println("3. Dependent");
        System.out.print("Enter your choice (1-3): ");
        int statusChoice = myscan.nextInt();
        
        String status;
        int children = 0;
        
        switch (statusChoice) {
            case 1:
                status = "Single";
                break;
            case 2:
                status = "Married";
                System.out.print("Enter the number of your children: ");
                children = myscan.nextInt();
                break;
            case 3:
                status = "Dependent";
                System.out.print("Enter the number of your children: ");
                children = myscan.nextInt();
                break;
            default:
                System.out.println("Invalid Choice!! Default to Single.");
                status = "Single";
                break;
        }
        
        float AnnualIncome;
        double tax = 0;
        double taxdeduction = 0.0;
        double deduction = 0.0;
        double income;
        double totalincome;
        
        System.out.print("Your Annual Income is: ");
        AnnualIncome = myscan.nextFloat();
        
        if (AnnualIncome < 250000) {
            System.out.println("You are EXEMPTED from tax");
        } 
        else if  (AnnualIncome >= 250000 && AnnualIncome <= 400000) {
            tax = AnnualIncome * 0.15;
            System.out.println("Your tax rate is 15%.");
        }
        else if  (AnnualIncome > 400000 && AnnualIncome <= 800000) {
            tax = AnnualIncome * 0.20;
            System.out.println("Your tax rate is 20%.");
        }
        else if  (AnnualIncome > 800000 && AnnualIncome <= 2000000) {
            tax = AnnualIncome * 0.25;
            System.out.println("Your tax rate is 25%.");
        }
        else if  (AnnualIncome > 2000000 && AnnualIncome <= 8000000) {
            tax = AnnualIncome * 0.30;
            System.out.println("Your tax rate is 30%.");
        }
        else if  (AnnualIncome > 8000000) {
            tax = AnnualIncome * 0.35;
            System.out.println(status + " - Your tax rate is 35%.");        
        }
        
        if (status.equals("Married")){
            if (children == 1) {
                deduction = 0.02;
                taxdeduction = tax * deduction;
            } 
            else if (children == 2) {
                deduction = 0.04;
                taxdeduction = tax * deduction;
            }
            else if (children == 3) {
                deduction = 0.06;
                taxdeduction = tax * deduction;
            }
            else if (children > 3 ) {
                deduction = 0.08;
                taxdeduction = tax * deduction;
            }
        }
        if (status.equals("Dependent")){
            if (children == 1) {
                deduction = 0.02;
                taxdeduction = tax * deduction;
            } 
            else if (children == 2) {
                deduction = 0.04;
                taxdeduction = tax * deduction;
            }
            else if (children == 3) {
                deduction = 0.06;
                taxdeduction = tax * deduction;
            }
            else if (children > 3 ) {
                deduction = 0.08;
                taxdeduction = tax * deduction;
            }
        }
        income = AnnualIncome - tax;
        totalincome = (AnnualIncome - tax) + taxdeduction;
        if (AnnualIncome >= 250000){
        System.out.println("Your Total Annual Tax is: " + tax);
        System.out.println("Your Annual Income is: " + income);
        }
        
    if (status.equals("Married") && AnnualIncome >= 250000){
        System.out.println(status + " - Deduction Applied: " + (deduction * 100) + "%");
        System.out.println(status + " - Your tax deduction is: " + taxdeduction);
        System.out.println(status + " - Your Total Annual Income is: " + totalincome);
    }
    
    if (status.equals("Dependent") && AnnualIncome >= 250000){
        System.out.println(status + " - Deduction Applied: " + (deduction * 100) + "%");
        System.out.println(status + " - Your tax deduction is: " + taxdeduction);
        System.out.println(status + " - Your Total Annual Income is: " + totalincome); 
    }
}
    }