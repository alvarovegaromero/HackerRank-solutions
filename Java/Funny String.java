//Link: https://www.hackerrank.com/challenges/funny-string/problem

class Result {
    
    //Returns the absolute difference of two ascii values
    public static int absoluteDifferences(char a, char b){
        return Math.abs(a-b);
    }
    
    /*
     * Complete the 'funnyString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String funnyString(String s) {
    // Write your code here
        String result = "Funny"; //Initially, they are all funny
        
        for(int i = 0, j = s.length()-1; i < s.length()-1; i++, j--){
            //Two indexes for comparing the first and last difference, then the second and the penultimate...
            //If they are different in any index, then the array is not funny :(
            if(absoluteDifferences(s.charAt(i), s.charAt(i+1)) != absoluteDifferences(s.charAt(j), s.charAt(j-1))){
                result = "Not Funny";
                break;
            }
        } 
        
        return result;
    }
}