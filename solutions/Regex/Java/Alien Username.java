// Link: https://www.hackerrank.com/challenges/alien-username/problem

public class Solution {

    public static void main(String[] args) {

        int n; //sentences
        String pattern;
        String sentence;
        
        pattern = "^(\\_|\\.)[0-9]+[a-zA-Z]*(\\_?)$"; 
            
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt(); //number of sentences

        obj.nextLine();
        for(int i = 0; i < n; i++) {
            sentence = obj.nextLine();
            
            if(sentence.matches(pattern)) 
                System.out.println("VALID");
            else 
                System.out.println("INVALID");
        
        }        
        
        obj.close();
    }
}