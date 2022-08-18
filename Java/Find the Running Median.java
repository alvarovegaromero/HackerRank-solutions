//Link: https://www.hackerrank.com/challenges/find-the-running-median/problem

class Result {

    /*
     * Complete the 'runningMedian' function below.
     *
     * The function is expected to return a DOUBLE_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */
    
    //Keeps track of big numbers that are bigger than current mean
    private static PriorityQueue<Integer> minHeap = new PriorityQueue<>(); 

    //Same but with low numbers.
    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); 
    
    public static void addInteger(int value){
        if (maxHeap.isEmpty()) //First element goes to maxHeap 
            maxHeap.add(value);
            
        else if (maxHeap.size() == minHeap.size()) { //Finishing with odd number of elements
            if (value < minHeap.peek()) //If is smaller than the least number of minHeap, goes to max
                maxHeap.add(value);
            else { //If is bigger, move the least big number from minHeap to max, and add it to min
                minHeap.add(value);
                maxHeap.add(minHeap.remove());
            }
        } 
        else if (maxHeap.size() > minHeap.size()) { //Finishing with even number of elements
            if (value > maxHeap.peek())
                minHeap.add(value);
            else { //In this case, if is equal, goes to minHeap and balances the qeues(otherwise to max)
                maxHeap.add(value);
                minHeap.add(maxHeap.remove());
            }
        }        
    }
    
    public static double getMedian(){
        if( maxHeap.size() == 0) //no elements - 0 is the mean
            return 0.0;
        else if(minHeap.size() == maxHeap.size()) //even number of elements
            return (maxHeap.peek() + minHeap.peek()) / 2.0;  
        else //odd number of elements. Just the middle element
            return maxHeap.peek();  
    }

    public static List<Double> runningMedian(List<Integer> a) {
        //Simple but not efficient answer -> List, Sort and get Index
        // Our answer --> Two PriorityQueues. They ordenate themselves and depends on how many elements we have on both, we will use one, or both tops elements for calculating the mean
        
        List<Double> medians = new ArrayList<Double>() ;

        for(int i = 0; i < a.size() ; i++){
            addInteger(a.get(i));
            medians.add(getMedian());
        }
        
        return medians;
    }
}