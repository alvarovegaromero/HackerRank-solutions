// Link: https://www.hackerrank.com/challenges/find-substring/problem

import java.io.*;
import java.util.*;
import java.util.regex.*; //IMPORTANT

public class Solution {

    public static void main(String[] args) {
        /* Read input from STDIN. Print output to STDOUT. */
        
        ///////////////////////////////////
        // Declaration of variables
        int queries;
        int n; //sentences
        String substring;
        int count; //counting ocurrences of s as sub-word
        Pattern pattern;
        Matcher matcher;
        
        ///////////////////////////////////
        // Reading and storing input
            
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt(); //number of sentences

        obj.nextLine();
        List<String> sentences = new ArrayList<String>();
        for(int i = 0; i < n; i++) {
            String s = obj.nextLine();
            sentences.add(s); 
        }

        queries = obj.nextInt();

        ///////////////////////////////////
        // Processing input, matching sentences with pattern

        for(int i = 0; i < queries; i++) {
            substring = obj.next(); //Could be more than 1 query
            count = 0;
            pattern = Pattern.compile("[a-zA-Z0-9_]+" + substring + "[a-zA-Z0-9_]+"); 

            for(String str: sentences) {
                matcher = pattern.matcher(str);   
                while (matcher.find())
                    count++;
            }
            
            System.out.println(count); //Printing to output            
        }
        
        obj.close();
    }
}
