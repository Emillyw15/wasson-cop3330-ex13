/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.RoundingMode;

public class prog13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Enter the principal: ");
        int principal = in.nextInt();
        System.out.print("Enter the rate of interest: ");
        double rate = in.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = in.nextInt();
        System.out.print("What is the number of times the interest is compounded per year?");
        int compounded = in.nextInt();

        double total = principal * Math.pow((1 + ((rate / 100) / compounded)), (compounded * years));

        df.setRoundingMode(RoundingMode.UP);
        System.out.println("$" + principal + " invested at " + rate + "% for " + years + " years compounded " + compounded + " times per year is $" + df.format(total));


    }
}
