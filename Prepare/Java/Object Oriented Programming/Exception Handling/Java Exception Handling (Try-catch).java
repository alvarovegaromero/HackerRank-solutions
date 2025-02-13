//https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        try {
            Scanner myObj = new Scanner(System.in);
            int x = myObj.nextInt();
            int y = myObj.nextInt();
            myObj.close();
            
            System.out.print(x / y);
        } catch (InputMismatchException e) {
            System.out.print(e.getClass().getName());
        } catch (Exception e){
            System.out.print(e);
        }
        
    }
}
