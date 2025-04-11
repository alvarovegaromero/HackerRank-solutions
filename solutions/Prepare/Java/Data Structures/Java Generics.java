//https://www.hackerrank.com/challenges/java-generics/problem

import java.io.*;
import java.util.*;

public class Solution {
    private static <T> void printArray(T[] array) {
        for(T item: array)
            System.out.println(item);
    }

    public static void main(String[] args) {
        printArray(new Integer[]{1, 2, 3});
        printArray(new String[]{"Hello", "World"});
    }
}