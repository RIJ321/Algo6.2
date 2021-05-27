package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();

        System.out.println(sumDigits(in));

    }

    static int sumDigits(int n)
    {
        return n == 0 ? 0 : n % 10 + sumDigits(n / 10);
    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }



    public static int square(int n){
        if(n == 0){
            return 0;
        }else{
            return ((square(n-1)+ (2*n)-1));
        }
    }

}
