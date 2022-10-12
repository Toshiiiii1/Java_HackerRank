package String_Reverse;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        String B = new String();
        int i;
        for (i = A.length()-1; i >= 0; i--)
            B += A.charAt(i);

        if (B.equals(A))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}