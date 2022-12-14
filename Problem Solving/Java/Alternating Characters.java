//Link: https://www.hackerrank.com/challenges/alternating-characters/problem

class Result {

    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternatingCharacters(String s) {

        int i = 1; //we will start from 1 to s.length
        int deletions = 0;
        char last_char_read = s.charAt(0); //first character is treated specially
        
        while (i < s.length()){
            
            if(s.charAt(i) == last_char_read)
                deletions++;
            else //new character
                last_char_read = s.charAt(i);
            
            i++;
        }
        
        return deletions;
    }
}