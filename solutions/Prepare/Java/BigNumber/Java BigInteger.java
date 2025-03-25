//https://www.hackerrank.com/challenges/java-biginteger/problem

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger a = sc.nextBigInteger();
        // another option is BigIngeger a = new BigInteger(sc.next());
        BigInteger b = sc.nextBigInteger();
    
        sc.close();
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
