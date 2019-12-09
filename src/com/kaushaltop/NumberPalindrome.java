package com.kaushaltop;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        //Logic for reversing the number
        int reversed = 0;

        //Since at end of loop number will be equal to 0,
        // therefore, initially store number in a variable
        // in this case int number2 = number;
        int number2 = number;

        while (number != 0) {

            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;

        }

        //Condition checking the number and the reverse of the number
        if (number2 == reversed) {

            //System.out.println("Number "+number+" is a palindrome");
            return true;
        }

        //System.out.println("Number "+number+" is not a palindrome");
        return false;
    }

}
