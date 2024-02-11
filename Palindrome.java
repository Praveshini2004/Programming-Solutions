/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindrome;

/**
 *
 * @author DELL
 */
import java.util.*;
public class Palindrome {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        str = str.toLowerCase(); 
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char leftChar = str.charAt(left);
            char rightChar = str.charAt(right);

            if (!isAlphanumeric(leftChar)) {
                left++;
            } else if (!isAlphanumeric(rightChar)) {
                right--;
            } else if (leftChar != rightChar) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }

    private static boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}

    