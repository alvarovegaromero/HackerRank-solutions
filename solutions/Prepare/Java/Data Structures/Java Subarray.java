//https://www.hackerrank.com/challenges/java-negative-subarray/problem

// First approach - Time Complexity: O(n^3)
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    int[] array = new int[n];
    
    for(int i = 0; i < n; i++) {
        array[i] = sc.nextInt();
    }
    
    System.out.println(countSubarraysWithNegativeSums(array));
    
    sc.close();
}

private static int countSubarraysWithNegativeSums(int[] array) {
    int count = 0;
    int currentSum;
    
    // Look all the possible subArrays and check it sums
    for(int i = 1; i <= array.length; i++) {
        for(int j = 0; j <= array.length - i; j++) {
            currentSum = 0;

            for(int z = 0; z < i; z++)
                currentSum += array[j + z];
            
            if(currentSum < 0)
                count++;
        }
    }
    
    return count;
}

// Second approach - Time Complexity: O(n^2) 
// Fixing values and look for all its subarrays. Check in every iteration if the sum is negative.
// (e.g. 1 fixed then, (1), (1,2), (1,2,3), (1,2,3,4), (1,2,3,4,5) and so on with next fixed value)
private static int countSubarraysWithNegativeSums(int[] array) {
    int count = 0;
    int currentSum;
    int n = array.length;
    
    // Look all the possible subArrays and check 
    for (int start = 0; start < n; start++) {
        currentSum = 0;
        for (int end = start; end < n; end++) {
            currentSum += array[end];
            
            if (currentSum < 0)
                count++;
            
        }
    }
    
    return count;
}