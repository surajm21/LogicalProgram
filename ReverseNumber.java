package com.bridglabz.Logical;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.print("Enter the number that you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("The reverse of the given number is: ");
        ReverseNum(num);
    }
    public static void ReverseNum(int number) {

        if (number < 10) {
            System.out.println(number);
        } else {
            System.out.print(number % 10);
            ReverseNum(number / 10);
        }
    }
}
