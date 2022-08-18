//Link: https://www.hackerrank.com/challenges/diagonal-difference/problem

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int left_right_diagonal = 0;
        int right_left_diagonal = 0;
        
        for(int i = 0 ; i < arr.size() ; i++)
            left_right_diagonal += arr.get(i).get(i);
             
            
        for(int j = 0 ; j < arr.size() ; j++){
            right_left_diagonal += arr.get(arr.size() - j - 1).get(j);
            System.out.println(right_left_diagonal);

        }
        
        
        return Math.abs((left_right_diagonal - right_left_diagonal));
        
    }

}