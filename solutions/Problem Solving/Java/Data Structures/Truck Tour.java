//Link: https://www.hackerrank.com/challenges/truck-tour/problem

class petrolStation{ //Struct with both values
    int dist_next_station;
    int petrol_amount;
    
    public petrolStation(int petrol_amount, int dist_next_station){
        this.dist_next_station = dist_next_station;
        this.petrol_amount = petrol_amount;
    }
}

class Result {
    
    /*
     * Complete the 'truckTour' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY petrolpumps as parameter.
     */

    public static int truckTour(List<List<Integer>> petrolpumps) {
        //List where every index has to values -> amount of petro, distance to the next
    
        //Queue with all the pumps in order.
        Queue<petrolStation> queue = new LinkedList<>();
        
        for(int i = 0 ; i < petrolpumps.size() ; i++){ 
            queue.add(new petrolStation(petrolpumps.get(i).get(0), petrolpumps.get(i).get(1)));
        }
                
        int j = 0; //represents how many pumps have been processed this iteration
        int deposit_amount = 0;
        int index_start = 0;
        petrolStation current_station;
        
        while(j < petrolpumps.size()){
            current_station = queue.poll();
            
            deposit_amount += current_station.petrol_amount;
            
            if(deposit_amount >= current_station.dist_next_station){ //there is enough gas
                j++;
                deposit_amount -= current_station.dist_next_station;
            }
            else{
               index_start += j + 1; //key line - keep new "start" index
               // += because j could be started not from the beginning
                                            
               deposit_amount = 0;
               j = 0;  
            }
            
            queue.add(current_station);
        }
    
        return index_start;
    }

}