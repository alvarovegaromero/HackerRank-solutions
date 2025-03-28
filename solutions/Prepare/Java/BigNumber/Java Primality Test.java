//https://www.hackerrank.com/challenges/java-primality-test/problem

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        if((new BigInteger(n).isProbablePrime(100)))
            System.out.println("prime");
        else 
            System.out.println("not prime");

        bufferedReader.close();
    }
}
