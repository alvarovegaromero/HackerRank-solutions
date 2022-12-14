//Link: https://www.hackerrank.com/challenges/simple-text-editor/problem

// IMPORTANT: Score: 47.67 - Some executions are terminated due to timeout :( 
// I tried to solve it, but I couldn't

public class Solution {

    public static void main(String[] args) {

        //Optimization - Still not good enought for 3 cases :()
        StringBuilder outputToConsole = new StringBuilder();          
        ////
        
        String s = "";        
        Stack<String> st = new Stack<String>(); //For saving all the changes on the string 
        st.push(s); //Save the first state (empty)
        
        Scanner in = new Scanner(System.in);
        int operations = in.nextInt(); //Read the number of operations of the input
        
        for(int i = 0; i < operations; i++){
            int t = in.nextInt();
            
            if(t==1){ //Append a substring
                s = s + in.next(); //append the next substring
                st.push(s); //Save
            }
            else if(t==2){ //Delete last characters
                s = s.substring(0, s.length() - in.nextInt()); //Take out the last in.nextInt() characters
                st.push(s); //Save
            }
            else if(t==3){ //Print characters
            
                //Optimization                 
                outputToConsole.append(s.charAt(in.nextInt()-1) + "\n");
                System.out.print(outputToConsole);
                outputToConsole.delete(0, outputToConsole.length());
                
                //System.out.print(s.charAt(in.nextInt() - 1) + "\n");  //print char
            }
                //(-1 because the real index starts at 0)
            else{ //t==4 - Undo last operation
                st.pop(); //Take out the last state (we want the previous)
                s = st.peek(); //Check the previous state
            }
        }
            
        in.close();
    }
}
