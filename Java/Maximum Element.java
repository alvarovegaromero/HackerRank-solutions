//Link: https://www.hackerrank.com/challenges/maximum-element/problem

class Result {

    /*
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */

    public static List<Integer> getMax(List<String> operations) {
        int n = operations.size();
        List<Integer> result = new ArrayList<>();
        
        int new_value;
        int operation;
        String[] parts;
        String current_string;
        
        Stack<ValueAndMaximum> stack = new Stack<ValueAndMaximum>();
        
        for(int i = 0 ; i < n ; i++)
        {
            current_string = operations.get(i);
            parts = current_string.split(" ");
            operation = Integer.parseInt(parts[0]);          
            
            if(operation == 1) //Push element x
            {

                new_value = Integer.parseInt(parts[1]);
                
                if(stack.isEmpty())
                    stack.push(new ValueAndMaximum(new_value, new_value));
                
                else if(new_value > (stack.peek().maximum))
                    stack.push(new ValueAndMaximum(new_value, new_value));
                else{
                    stack.push(new ValueAndMaximum(new_value, stack.peek().maximum));
                    
                }
                    
            }
            else if (operation == 2) //Delete value at the top of the stack
            {

                if(!stack.isEmpty())
                    stack.pop();
            }
            else // ==3 - Print maximum value
            {
                if(!stack.isEmpty())
                    result.add(stack.peek().maximum);
            }                           
        }
        return result;
    }

}