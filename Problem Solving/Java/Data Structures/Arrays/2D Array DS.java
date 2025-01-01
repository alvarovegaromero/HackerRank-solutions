//https://www.hackerrank.com/challenges/2d-array/problem

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

     public static int hourglassSum(List<List<Integer>> arr) {        
        int max = Integer.MIN_VALUE;
        int currentValue;
        
        for(int i = 0; i < arr.size()-2 ; i++){ 
            for(int j = 0; j < arr.get(i).size()-2; j++){
                currentValue = 0;

                // Upper row elements + Middle's element + Lower row elements
                currentValue += arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) + 
                                 arr.get(i+1).get(j+1) +
                                 arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);       
                                                
                if(currentValue > max)
                    max  = currentValue;
            }
        }
        
        return max;
    }
}