package com.company;

import java.util.Scanner;

public class Fibonacci {
    int fib(int x){
        if(x <= 1)
            return x;
        int a = 0, b= 1;
        while(x-- > 1){
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
class FibonacciTest {
    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        Scanner scanner = new Scanner(System.in);
        int newFibo = scanner.nextInt();
        int a = fibo.fib(newFibo);
        System.out.println(a);
    }
}