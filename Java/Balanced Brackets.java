//Link: https://www.hackerrank.com/challenges/balanced-brackets/problem

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        // 1 {}
        // 2 []
        // 3 ()
        Stack<Character> stack = new Stack<>();
        char current_char;
        boolean is_going_good = true; //if is emty, is good
        char value_top_queue;
        
        for(int i = 0 ; i < s.length() && is_going_good; i++)
        {
            current_char = s.charAt(i);
            if(current_char == '{')
                stack.push('{');
            else if(current_char == '[')
                stack.push('[');
            else if(current_char == '(')
                stack.push('(');
            else if(current_char == '}' && stack.size() > 0){
                value_top_queue = stack.pop();
                if(value_top_queue != '{')
                    is_going_good = false;
            }
            else if(current_char == ']' && stack.size() > 0){
                value_top_queue = stack.pop();
                if(value_top_queue != '[')
                    is_going_good = false;
            }
            else if(current_char == ')' && stack.size() > 0){
                value_top_queue = stack.pop();
                if(value_top_queue != '(')
                    is_going_good = false;
            }
            else
                is_going_good = false;                              
        }
        
        if(stack.size() != 0)
            is_going_good = false;
            
        if(is_going_good){
            return ("YES");
        }
        else{
            return ("NO");
        }

    }

}