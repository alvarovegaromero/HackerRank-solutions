//https://www.hackerrank.com/challenges/mars-exploration/problem

public static int marsExploration(String s) {
    String originalMessage = "SOS";
    int differences = 0;
    
    for(int i = 0; i < s.length(); i++) {
        int divRemainder = i % 3;
        
        if(s.charAt(i) != originalMessage.charAt(divRemainder))
            differences++;
    }
    
    return differences;
}