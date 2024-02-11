/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nextpalindromenumber;

/**
 *
 * @author DELL
 */
import java.util.*;
public class NextPalindromeNumber {
    
    public static int nextPalindrome(int num) {
        if (num <= 9) {
            return num + 1;
        }
        
        int length = String.valueOf(num).length();
        int[] digits = new int[length];
        
        for (int i = 0; i < length; i++) {
            digits[i] = num % 10;
            num /= 10;
        }
        
        int left = length / 2 - 1;
        int right = (length % 2 == 0) ? length / 2 : length / 2 + 1;
        boolean incrementLeft = false;
        
        while (left >= 0 && right < length) {
            if (digits[left] < digits[right]) {
                incrementLeft = true;
            } else if (digits[left] > digits[right]) {
                incrementLeft = false;
            }
            digits[right] = digits[left];
            left--;
            right++;
        }
        
        if (incrementLeft) {
            int carry = 1;
            left = length / 2 - 1;
            right = (length % 2 == 0) ? length / 2 : length / 2 + 1;
            while (left >= 0 && carry != 0) {
                int sum = digits[left] + carry;
                digits[left] = sum % 10;
                carry = sum / 10;
                digits[right] = digits[left];
                left--;
                right++;
            }
        }
        
        int nextPalindrome = 0;
        for (int i = length - 1; i >= 0; i--) {
            nextPalindrome = nextPalindrome * 10 + digits[i];
        }
        
        return nextPalindrome;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Next palindrome after " + num + " is: " + nextPalindrome(num)); // Output: 131
    }
}