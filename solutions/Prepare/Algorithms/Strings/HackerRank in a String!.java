//https://www.hackerrank.com/challenges/hackerrank-in-a-string

public static String hackerrankInString(String s) {
    final String TARGET = "hackerrank";
    
    int lettersMatched = 0;
    
    for(char c : s.toCharArray()) {            
        if(c == TARGET.charAt(lettersMatched)) {
            lettersMatched++;
                        
            if(lettersMatched == TARGET.length())
                return "YES";
        }
    }
    
    return "NO";
}