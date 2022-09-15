package com.company;

import java.util.Scanner;

public class FizzBuzz {
    void fizzbuzz(int x) {
        if (x % 5 == 0 && x % 3 == 0) {
            System.out.println("fizz-buzz");
        } else if (x % 5 == 0) {
            System.out.println("buzz");
        } else if (x % 3 == 0) {
            System.out.println("fizz");
        }
    }
}
    class FizzBuzzTest {
        public static void main(String[] args) {
            FizzBuzz number = new FizzBuzz();
            Scanner scanner = new Scanner(System.in);
            int newNumber = scanner.nextInt();
            number.fizzbuzz(newNumber);
        }
    }
