package com.company;

import java.util.Scanner;

class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') { 
                length++;
            } else {  
                if (length > 0) return length;
            }
        }
        return length;
    }
}
class LengthOfLastWordTest {
    public static void main(String[] args) {
        LengthOfLastWord length = new LengthOfLastWord();
        Scanner scanner = new Scanner(System.in);
        String newInput = scanner.nextLine();
        int a = length.lengthOfLastWord(newInput);
        System.out.println(a);

    }
}
