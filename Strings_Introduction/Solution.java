package Strings_Introduction;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        if (A.compareTo(B) > 0)
            System.out.println("YES");
        else
            System.out.println("NO");
        // charAt(): lay ra phan tu tai vi tri duoc chi dinh trong chuoi
        // Character.toUpperCase(): in hoa ki tu
        System.out.println(A.replace(A.charAt(0), Character.toUpperCase(A.charAt(0))) + " " + B.replace(B.charAt(0), Character.toUpperCase(B.charAt(0))));
    }
}