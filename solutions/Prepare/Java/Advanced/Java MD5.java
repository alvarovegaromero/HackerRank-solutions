//https://www.hackerrank.com/challenges/java-md5

import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {
    private static String algorithmToApply = "MD5";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.next();
        
        System.out.println(convertToMd5(s));
        
        scanner.close();        
    }
    
    public static String convertToMd5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance(algorithmToApply);
            byte[] hashBytes = md.digest(input.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                hexString.append(String.format("%02x", b));
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error: MD5 algorithm not available.", e);
        }
    }
}
