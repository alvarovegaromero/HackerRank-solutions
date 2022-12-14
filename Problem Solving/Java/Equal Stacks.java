//Link: https://www.hackerrank.com/challenges/equal-stacks/problem

class Result {

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        //Phylosophy --> create stacks which values represent the sum of the previous values and the current one
               
        //Creating the stacks        
        Stack<Integer> stack1 = new Stack<>(); 
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();       
        
        //Filling the stacks
        for(int i = h1.size() - 1; i >= 0; i--){ //
            if(!stack1.isEmpty()) //all the cases except the first one
                stack1.push(h1.get(i) + stack1.peek());
            else
                stack1.push(h1.get(i));            
        }
        
        for(int i = h2.size() - 1; i >= 0; i--){
            if(!stack2.isEmpty())
                stack2.push(h2.get(i) + stack2.peek());
            else
                stack2.push(h2.get(i));
        }
        
        for(int i=h3.size()-1; i>=0; i--){
            if(!stack3.isEmpty())
                stack3.push(h3.get(i) + stack3.peek());            
            else
                stack3.push(h3.get(i));
        }
     
     ////////////////////////////////////////////////////////////////
     
    int stack1Height = stack1.peek(); //Values of every peak
    int stack2Height = stack2.peek();
    int stack3Height = stack3.peek();

    while((!stack1.isEmpty()) && (!stack2.isEmpty()) && (!stack3.isEmpty())){
        
        //If we reach the common height, return it
        if(stack1Height == stack2Height && stack2Height == stack3Height)
            return stack1.peek(); 
    
        //If height of a stack is the biggest -> reduce its heigh until common height
        if((stack1Height > stack2Height) || (stack1Height > stack3Height)){
            stack1.pop();
            
            if(!stack1.isEmpty())
                stack1Height = stack1.peek();
        }
        else if((stack2Height > stack1Height) || (stack2Height > stack3Height)){
            stack2.pop();

            if(!stack2.isEmpty())
                stack2Height = stack2.peek();
        }
        else if((stack3Height > stack1Height) || (stack1Height > stack2Height)){
            stack3.pop();

            if(!stack3.isEmpty())
                stack3Height = stack3.peek();
        }
    }
    
    return 0; //if we didnt find any common

    }        
}
