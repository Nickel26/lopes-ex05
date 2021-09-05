import java.util.Scanner;

public class solution05 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 1 Solution
     *  Copyright 2021 Nicholas Lopes
     */
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        /*
        Prompt user for first number and second number input
        Store inputs and convert from strings to integers
        Calculate and store sum, difference, product, and quotient of inputs
        Display final answers of calculations
         */
        String num1, num2;
        int n1, n2;

        System.out.print("What is the first number?");
        num1 = in.nextLine();
        System.out.print("What is the second number?");
        num2 = in.nextLine();

        n1 =Integer.parseInt(num1);
        n2 =Integer.parseInt(num2);

        int sum = n1 + n2;
        int diff = n1 - n2;
        int product = n1 * n2;
        int quotient = n1 / n2;

        System.out.printf("%d + %d = %d \n%d - %d = %d \n%d * %d = %d \n%d / %d = %d",n1 ,n2 ,sum,n1 ,n2 ,diff,n1 ,n2 ,product,n1 ,n2 ,quotient);
    }

}
