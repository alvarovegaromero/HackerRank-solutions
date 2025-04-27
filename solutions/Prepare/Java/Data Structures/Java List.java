//https://www.hackerrank.com/challenges/java-list

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++)
            list.add(scanner.nextInt());
            
        int queries = scanner.nextInt();
        for(int i = 0; i < queries; i++) {
            String query = scanner.next();
            
            int index = scanner.nextInt();
            if (query.equals("Insert")){
                int newValue = scanner.nextInt();
                list.add(index, newValue); 
            }
            else
                list.remove(index);
        }
        
        scanner.close();
        
        for(Integer num : list)
            System.out.print(num + " ");
    }
}