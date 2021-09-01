import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Solution05 {
    public static void main(String[] args)
    {
        /*
         *  UCF COP3330 Fall 2021 Assignment 5 Solution
         *  Copyright 2021 Kimari Guthre
         */
        /* Ask for first number
        Then store and convert first number to int
        Then second number
        Then store and convert second number to int
        Then show number1 + number2
        Then number1 - number2
        Then number1 * number2
        And finally number1 / number2
         */
        Scanner in = new Scanner(System.in);
        System.out.print("What is the first number? ");
        int num1 = parseInt(in.nextLine());
        System.out.print("What is the second number? ");
        int num2 = parseInt(in.nextLine());
        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;
        //Have to do this foolishness to make division work properly and look good.
        String quot = Float.toString((float) num1 / num2);
        //Side note: String substitution is much easier to me than string concatenation here.
        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %s", num1, num2, sum, num1, num2, diff, num1, num2, prod, num1, num2, quot);
    }
}
