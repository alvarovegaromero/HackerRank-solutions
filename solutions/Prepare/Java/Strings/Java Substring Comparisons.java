//https://www.hackerrank.com/challenges/java-string-compare/problem

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        String substring;
        
        for(int i = 0; i <= s.length() - k; i++) {
            substring= s.substring(i, i + k);
            
            if(substring.compareTo(smallest) < 0)
                smallest = substring;
            
            if(substring.compareTo(largest) > 0)
                largest = substring;
        }
        
        return smallest + "\n" + largest;
    }
