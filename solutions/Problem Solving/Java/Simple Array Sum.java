//Link: https://www.hackerrank.com/challenges/simple-array-sum/problem

class Result {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
    // Write your code here
        int sum = 0;
        for(int i = 0 ; i < ar.size() ; i++)
            sum = sum + ar.get(i);
    
        return sum;
    }

}