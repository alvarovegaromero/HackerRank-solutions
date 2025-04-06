//https://www.hackerrank.com/challenges/java-arraylist/problem

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int lengthCurrentArray;
        int currentVal;
        int arrays = sc.nextInt();
        ArrayList<Integer>[] arr = new ArrayList[arrays];

        for (int i = 0; i < arrays; i++) {
            lengthCurrentArray = sc.nextInt();  
            arr[i] = new ArrayList<>();

            for (int j = 0; j < lengthCurrentArray; j++) {
                currentVal = sc.nextInt();
                arr[i].add(currentVal);
            }
        }

        int queries = sc.nextInt();  
        int array, pos;

        for (int i = 0; i < queries; i++) {
            array = sc.nextInt() - 1; // - 1 as index in arrays are [0, length - 1] 
            pos = sc.nextInt() - 1;  

            if (array < 0 || array >= arrays || 
                pos < 0 || pos >= arr[array].size())
                System.out.println("ERROR!");
            else 
                System.out.println(arr[array].get(pos));
        }
    }
}
