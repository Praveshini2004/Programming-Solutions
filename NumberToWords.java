/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numbertowords;

/**
 *
 * @author DELL
 */import java.util.*;
public class NumberToWords {    private static final String[] units = {"", "One ", "Two ", "Three ", "Four ",
            "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ", "Eleven ", "Twelve ",
            "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ",
            "Nineteen "};

    private static final String[] tens = {"", "", "Twenty ", "Thirty ", "Forty ",
            "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};

    public static String completewords(int n, String s) {
        String ans = "";
        if (n < 20) {
            ans += units[n];
        } else {
            ans += tens[n / 10] + units[n % 10];
        }
        if (n > 0)
            ans += s;
        return ans;

    }

    public static String convertToWords(Long n) {
        String result = "";
        result += completewords((int) (n / 10000000), "Crore ");
        result += completewords((int) ((n / 100000) % 100), "Lakh ");
        result += completewords((int) ((n / 1000) % 100), "Thousand ");
        result += completewords((int) ((n / 100) % 10), "Hundred ");
        if (n > 100 && n % 100 != 0) {
            result += "and ";
        }
        result += completewords((int) (n % 100), "");
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        System.out.println(convertToWords(number));
    }
}
