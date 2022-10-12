package Substring_Comparisons;

import java.util.*;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] list = new String[s.length()-k+1];
        int start = 0, end = start + k-1;
        while (end < s.length()) {
            list[start] = s.substring(start, end+1);
            start++;
            end = start + k-1;
        }
        largest = smallest = list[0];
        int i;
        for (i=1; i < list.length; i++) {
            if (list[i].compareTo(smallest) < 0)
                smallest = list[i];
            if (list[i].compareTo(largest) > 0)
                largest = list[i];
        }
        
        return smallest + "\n" + largest;
    }
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}