import java.io.*;
import java.util.*;

public class Solution {
    private static String[] getTokens(String s) {
        return s.split("[ !,?._'@]+");
    }
    
    private static void printTokens(String s) {
        if(s.isEmpty()){
            System.out.println(0);
            return;
        }
        
        String[] words = getTokens(s);
        
        System.out.println(words.length);
        
        for(String word : words)
            System.out.println(word);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        printTokens(s.trim());
    }
}
