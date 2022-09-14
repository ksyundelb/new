package com.company;

import java.util.Scanner;

public class Palindrome {
    boolean isPalindrome(int x){
        if (x < 0 || (x != 0 && x % 10 == 0))
            return false;
        int result = 0;
        while (x > result) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        return (x == result || x == result / 10);
    }
}
class PalindromeTest {
    public static void main(String[] args) {
    Palindrome palindrome = new Palindrome();
        Scanner scanner = new Scanner(System.in);
        int newInput = scanner.nextInt();
 boolean a = palindrome.isPalindrome(newInput);
        System.out.println(a);
    }
}

