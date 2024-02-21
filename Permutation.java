/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.permutation;

/**
 *
 * @author DELL
 */
import java.util.*;
public class Permutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        permute(0, str);
    }

    public static String swap(String str, int a, int b) {
        char[] ch = str.toCharArray();
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;
        return String.valueOf(ch);
    }

    public static void permute(int index, String str) {
        if (index == str.length() - 1) {
            System.out.print(str + ",");
            return;
        }
        Set<Character> swapped = new HashSet<>();
        for (int i = index; i < str.length(); i++) {
            if (!swapped.contains(str.charAt(i))) {
                swapped.add(str.charAt(i));
                str = swap(str, i, index);
                permute(index + 1, str);
                str = swap(str, i, index); 
            }
        }
    }
}
