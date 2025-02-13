//https://www.hackerrank.com/challenges/crush/problem

class Result {

    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] array = new long[n + 1]; 

        for (List<Integer> query : queries) {
            int a = query.get(0);
            int b = query.get(1);
            int k = query.get(2);

            array[a - 1] += k; // Mark beginning of interval
            array[b] -= k; // Mark ending of interval
        }

        long maxValue = Long.MIN_VALUE;
        long currentSum = 0;

        for (int i = 0; i < n; i++) { //Apply acumulative values
            currentSum += array[i]; 
            maxValue = Math.max(maxValue, currentSum);
        }

        return maxValue;
    }
}