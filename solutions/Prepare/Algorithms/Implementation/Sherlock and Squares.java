//https://www.hackerrank.com/challenges/sherlock-and-squares/problem

public static int squares(int a, int b) {
    // Square root and get next int (within the range)
    int start = (int) Math.ceil(Math.sqrt(a));
    // Square root and get previous int
    int end = (int) Math.floor(Math.sqrt(b));
    
    return Math.max(0, end - start + 1);
}