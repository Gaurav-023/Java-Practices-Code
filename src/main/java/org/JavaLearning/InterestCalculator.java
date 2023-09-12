package org.JavaLearning;
import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class InterestCalculator
{
    public static void main(String[] args)
    {
        //A = P*(1+(R/N))^N*T
        System.out.println("Welcome to our Interest Calculator");
        System.out.println(" ");
        System.out.println("Would you like to Continue our Interest Calculator (Y/N)");
        Scanner scanner = new Scanner(System.in);
        String input= scanner.next();
        while(input.equalsIgnoreCase("y"))
        {
            System.out.println("Enter Your Monthly Investment you want to spend");
            int MonthlyInvestment = scanner.nextInt();
            System.out.println("Enter your Years you want to spend");
            float YearsOfInvestment = scanner.nextFloat();
            System.out.println("Enter Your Expected Annual Interest Rate");
            double AnnualInterestRate = scanner.nextDouble();
            System.out.println("Enter Your Number of Times Interest is Compound");
            double CompoundInterest = scanner.nextDouble();
            float MonthOfInvestment =  (YearsOfInvestment *12);
            double ExpectedMonthlyInterestRate = AnnualInterestRate/12.0/100;
            double InterestRate = AnnualInterestRate/100.0f;
            double Value=0.0f;
            for(int i =0; i <MonthOfInvestment; i++)
            {
                Value =(MonthlyInvestment*Math.pow((1+(InterestRate/CompoundInterest)),(CompoundInterest*YearsOfInvestment)));
            }
            System.out.println("After Investing  = " +MonthlyInvestment+" You will get = " +Value+ " Amount");
            System.out.println("Would you like to Continue our Interest Calculator (Y/N)");
            input = scanner.next();



        }


    }


}
