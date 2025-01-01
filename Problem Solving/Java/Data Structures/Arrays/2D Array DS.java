//Link: https://www.hackerrank.com/challenges/2d-array/problem

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        
        int max = Integer.MIN_VALUE;
        int current_value;
        
        for(int i = 0; i < arr.size()-2 ; i++){ 
            //System.out.println(" ");
            for(int j = 0; j < arr.get(i).size()-2; j++){
                current_value = 0;
                current_value += arr.get(i).get(j) + arr.get(i).get(j+1) 
                                + arr.get(i).get(j+2); //Upper row elements
                                                
                current_value += arr.get(i+1).get(j+1); //Middle's element
                
                current_value += arr.get(i+2).get(j) + arr.get(i+2).get(j+1) 
                                + arr.get(i+2).get(j+2); //Lower row elements            
                                
                //System.out.print(current_value+" ");    
                
                if(current_value > max)
                    max  = current_value;
            }
        }
        
        return max;
    }

}