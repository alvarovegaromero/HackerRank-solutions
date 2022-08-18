//Link: https://www.hackerrank.com/challenges/fibonacci-modified/problem

class Result {

    /*
     * Complete the 'fibonacciModified' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER t1
     *  2. INTEGER t2
     *  3. INTEGER n
     */

    public static BigInteger fibonacciModified(int t1, int t2, int n) {
    // Write your code here
    //I changed the return type to 
        BigInteger[] intermediateTs = new BigInteger[n]; //static array with n elements
        intermediateTs[0] = BigInteger.valueOf(t1); //First element is t1 and the second is t2
        intermediateTs[1] = BigInteger.valueOf(t2);

        for(int i = 2 ; i < n ; i++) //n-2 iteractions. Using the given recurrence
            intermediateTs[i] = (
                intermediateTs[i - 2].add(
                    intermediateTs[i - 1].multiply(intermediateTs[i - 1])
                )
            );
        
        
        return intermediateTs[n - 1]; //Return last element -->  Tn
    }

}
