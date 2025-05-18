//https://www.hackerrank.com/challenges/java-end-of-file/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1;
        
        while(sc.hasNext()) {
            System.out.println(lineNumber + " " + sc.nextLine());
            lineNumber++;
        }
        
        sc.close();
    }
}