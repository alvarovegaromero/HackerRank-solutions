//https://www.hackerrank.com/challenges/java-2d-array/problem

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();
        
        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        System.out.println(getMaximumSumOfHourglass(arr));

        bufferedReader.close();
    }
    
    private static int getMaximumSumOfHourglass( List<List<Integer>> arr){
        int max = Integer.MIN_VALUE;
        int sum;
        
        for(int i = 1; i < arr.size() - 1; i++) {
            for(int j = 1; j < arr.get(0).size() - 1; j++) {
                sum = 0;

                // Row above center point
                sum += arr.get(i - 1).get(j - 1);
                sum += arr.get(i - 1).get(j);
                sum += arr.get(i - 1).get(j + 1);
                // Center point
                sum += arr.get(i).get(j);
                
                // Row below center point
                sum += arr.get(i + 1).get(j - 1);
                sum += arr.get(i + 1).get(j);
                sum += arr.get(i + 1).get(j + 1);
                
                if(sum > max)
                    max = sum;
            }
        }
        
        return max;
    }
}