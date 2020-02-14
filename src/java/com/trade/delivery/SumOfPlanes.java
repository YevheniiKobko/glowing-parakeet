package com.trade.delivery;

import java.util.Scanner;

public class SumOfPlanes {
    public static void main(String[] args) {
        System.out.println("Your number: "+ sum());
    }
    /* Creating a variable int sum. It calculates the sum of two numbers*/
    public static int sum () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scan.nextInt();
        System.out.println("Enter the second number: ");
        int b = scan.nextInt();
        int sum = a+b;
        return sum;
    }


    }
