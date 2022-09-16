package com.company;

import java.util.Scanner;

public class Sqrt {
 public int sqrt(int x){
     if (x == 0) return 0;
     int start = 1, end = x;
     while (start < end) {
         int mid = start + (end - start)/2;
         if (mid <= x / mid && (mid + 1) > x / (mid + 1))
             return mid;
         else if (mid > x / mid)
             end = mid;
         else
             start = mid + 1;
     }
     return start;
 }
}
class SqrtTest {
    public static void main(String[] args) {
        Sqrt mySqrt = new Sqrt();
        Scanner scanner = new Scanner(System.in);
        int newSqrt = scanner.nextInt();
        int a = mySqrt.sqrt(newSqrt);
        System.out.println(a);
    }
}