//Link: https://www.hackerrank.com/challenges/reduced-string/problem

class Result {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
        String reduced_string = s;
        //IDEA: traverse the string once, and if we see one pair, take it out. 
        //WARNING: after one exclussion, maybe we need to see if we have created
        // another pair
        for(int i = 1 ; i < reduced_string.length() ; i++){
            if(reduced_string.charAt(i) == reduced_string.charAt(i-1)){
                reduced_string = reduced_string.substring(0,i-1) + reduced_string.substring(i+1); //take out the pair (elements in position i-1 and i)
                i = 0; //reset counter
            }
        }
        
        if(reduced_string.length() == 0)
            reduced_string = "Empty String";

        return reduced_string;
    }
}