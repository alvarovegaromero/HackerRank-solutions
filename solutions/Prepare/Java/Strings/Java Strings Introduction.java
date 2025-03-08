//https://www.hackerrank.com/challenges/java-strings-introduction/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        // 1         
        System.out.println(A.length() + B.length());
        
        // 2
        if(isBiggerLexicographically(A, B))
            System.out.println("Yes");
        else
            System.out.println("No");

        // 3
        System.out.println(capitaliceFirstLetter(A) + " " + capitaliceFirstLetter(B));
    }
    
    private static boolean isBiggerLexicographically(String str1, String str2) {
        return (str1.compareTo(str2) > 0);
    }
    
    private static String capitaliceFirstLetter(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}



