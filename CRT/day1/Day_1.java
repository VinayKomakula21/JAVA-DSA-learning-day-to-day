// Given two integers, your task is to append first number to the second number.

import java.util.Scanner;

public class Day_1 {

    static String isHappyNumber(int n) {
        int first_part = n / 100;
        int second_part = n % 100;

        int product = (second_part/10) * (second_part%10);
        int sum = (first_part/10) + (first_part%10);

        return (product == sum) ? "Happy number" : "Not happy number";
    }

    static int appendNumbers(int a, int b) {
        int digitsCount = (int)Math.log10(a)+1;

         return b * (int)Math.pow(10, digitsCount) + a;
    }

    static int swapDigits(int n) {
        int lastDigit = n % 10;
        n = n / 10;
        if(n < 10)
            return lastDigit*10 + (n);
        int digitsCount = (int)Math.log10(n);
        int firstDigit = n / (int)Math.pow(10, digitsCount);
        int middle = n % (int)Math.pow(10, digitsCount);

        digitsCount = (int)Math.log10(middle)+1;

        int res = lastDigit * (int)Math.pow(10, digitsCount) + middle;
        res = res * 10 + firstDigit;

        return res;
    }

    public static void main(String[] args) {
        Scanner snr = new Scanner(System.in);
        int n = snr.nextInt();
        int a = snr.nextInt();
        System.out.println(appendNumbers(n,a));

    }
}


/*
Given a positive four digits integer N.
Check whether it is HAPPY NUMBER or NOT.
A number is said to be happy number if
product of last two digits is equal to
the sum of remaining digits.

Input:
2021

Output:
Happy number
*/