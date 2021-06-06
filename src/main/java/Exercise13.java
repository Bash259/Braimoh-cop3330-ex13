/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */



import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        System.out.println("What is the principal amount?");
        Scanner UserInput = new Scanner(System.in);
        int principal = UserInput.nextInt();

        System.out.println("What is the rate?");
        double rate = UserInput.nextDouble();
        double rateA = rate/100;

        System.out.println("What is the number of years?");
        int years = UserInput.nextInt();

        System.out.println("What is the number of times the interest is compounded per year?");
        int times = UserInput.nextInt();

        double x = (1 + (rateA/times));
        double y = years * times;
        double z =  Math.pow(x,y);
        double First = principal * z;


        String Output = "$"+principal+" invested at "+rate+"%"+ " for "+years+" years compounded "+times+" times per year is $"+First;
        System.out.println(Output);
    }
}
