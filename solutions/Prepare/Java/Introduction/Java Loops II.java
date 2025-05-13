import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int accumulatedSum = 0;
            for(int j = 0; j < n; j++) {
                accumulatedSum += pow2(j) * b;
                System.out.print((a + accumulatedSum) + " ");
            }
            
            System.out.println();
            
        }
        in.close();
    }
    
    private static int pow2(int exponent) {
        // Returns 2^exponent
        return 1 << exponent;
    }
}
