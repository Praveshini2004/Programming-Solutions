/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringexpansion;

/**
 *
 * @author DELL
 */
import java.util.*;
public class StringExpansion {

    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                char temp = s.charAt(i - 1);
                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                for (int j = 0; j < num; j++) {
                    System.out.print(temp);
                }
                num = 0;
            }
        }
    }
}
