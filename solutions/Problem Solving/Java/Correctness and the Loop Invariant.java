Link: https://www.hackerrank.com/challenges/correctness-invariant/problem

public static void insertionSort(int[] A){
        
        for(int i = 1; i < A.length; i++){
            int value = A[i]; //current_value
            int j = i - 1; //last position of ordered array
            
            while(j >= 0 && A[j] > value){ 
            //While the new one is smaller than an element of the array --> Finding its place
            // (and we don't iterate out of the array --> j > 0)
                A[j + 1] = A[j];
                j = j - 1;
            }
            
            A[j + 1] = value; //add a new cell with the biggest element (the new one or the last of the ordered ones)
        }

        printArray(A);
    }