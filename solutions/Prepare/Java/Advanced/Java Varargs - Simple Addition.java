//https://www.hackerrank.com/challenges/simple-addition-varargs/problem

class Add {
    void add(int...nums){
        int sum=0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            System.out.print(nums[i]);
            
            if(i < nums.length - 1)
                System.out.print("+");
        }
        
        System.out.println("=" + sum);
    }
}