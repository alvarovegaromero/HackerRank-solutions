//https://www.hackerrank.com/challenges/angry-children

// Time complexity: O(n log n)
// Space complexity: O(1)
public static int maxMin(int k, List<Integer> arr) {
    int min = Integer.MAX_VALUE;
    
    Collections.sort(arr);
    
    for(int i = 0; i <= arr.size() - k; i++) {
        min = Math.min(min, arr.get(i + k - 1) - arr.get(i));
    }
    
    return min;
}