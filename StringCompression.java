/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringcompression;

/**
 *
 * @author DELL
 */
import java.util.*;
public class StringCompression {

    public static void main(String[] args) {Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(getCompressedString(str));
    }

    public static String getCompressedString(String str) {
        String ans = "";
        char ch = str.charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            } else {
                ans += ch;
                if (count > 1) {
                    ans += count;
                }
                count = 1;
                ch = str.charAt(i);
            }
            if (i == str.length() - 1) {
                ans += ch;
                if (count > 1) {
                    ans += count;
                }
            }
        }
        return ans;
    }
}
