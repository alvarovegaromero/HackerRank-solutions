//Link: https://www.hackerrank.com/challenges/camelcase/problem

class Result {

    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcase(String s) {
        int words = 0;
        int length = s.length();
        
        if(length > 0){
            words = 1; //at least one word that start without capital letter
            char current_char;
            
            for(int i = 0 ; i < length ; i++){
                current_char = s.charAt(i);
                if(current_char >= 65 && current_char <= 90) //is a capital letter
                    words++;
            }
        }
        
        return words;
    }

}