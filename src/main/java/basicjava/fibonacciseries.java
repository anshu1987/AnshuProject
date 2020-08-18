package basicjava;

import java.util.Scanner;

public class fibonacciseries {

    //Write a simple Java program which will print Fibonacci series,
    //e.g. 1 1 2 3 5 8 13 ... . up to a given number.

    public static void printfibonacciseries() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter maximum number");
        int fibonaxxinumber = input.nextInt();
        System.out.println("Print maximum number" + fibonaxxinumber);
        int series = fibonacci2(fibonaxxinumber);
        System.out.println("Fibonacci Seriees" + series);
        //printing Fibonacci series upto number
        for (int i = 1; i <= fibonaxxinumber; i++) {
            System.out.print(fibonacci2(i) + " ");
        }


    }

    public static void main(String[] args) {
        printfibonacciseries();

    }


    /*
     * Java program for Fibonacci number using recursion.
     * This program uses tail recursion to calculate Fibonacci number for a given number
     * @return Fibonacci number
     */
    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number - 2); //tail recursion
    }

    /*
     * Java program to calculate Fibonacci number using loop or Iteration.
     * @return Fibonacci number
     */
    public static int fibonacci2(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= number; i++) {

            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci; //Fibonacci number

    }

}
