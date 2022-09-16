package com.company;

import java.util.Scanner;

class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;

        // We are looking for the last word so let's go backward
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') { // a letter is found so count
                length++;
            } else {  // it's a white space instead
                //  Did we already started to count a word ? Yes so we found the last word
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