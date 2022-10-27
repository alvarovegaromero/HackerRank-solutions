//Link: https://www.hackerrank.com/challenges/pangrams/problem

class Result {
    
    final static int tam_alphabet = 26; //number of letter of the english alphabet
    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        
        String string_in_lowercase = s.toLowerCase();
        Set<Character> set = new HashSet<Character> (); 
        
        for(int i = 0 ; i < string_in_lowercase.length() ; i++){
            if(string_in_lowercase.charAt(i) != ' ')
                set.add(string_in_lowercase.charAt(i));
        }

        if(set.size() == tam_alphabet)
            return "pangram";
        else
            return "not pangram";
    }

}