/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mismatchedstrings;

/**
 *
 * @author DELL
 */
import java.util.*;
public class MismatchedStrings {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        compareStrings(str1, str2);
    }

    private static void compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("Input strings must be of equal length.");
            return;
        }

        System.out.println("Output:");

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                System.out.println(str1.charAt(i) + ", " + str2.charAt(i));
            }
        }
    }
}
