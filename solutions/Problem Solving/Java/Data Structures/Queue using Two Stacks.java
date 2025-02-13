// https://www.hackerrank.com/challenges/queue-using-two-stacks/problem

import java.io.*;
import java.util.*;

public class Solution {
    
    //First solution: Insert in one stack and whenever we need to dequeue or check the front value, move all elements to the other stack, do the operation, and move back all the elements
    
    //Second solution: Insert in one stack, but we keep in the second stack the elements we moved for dequeue and check the front value because they are ordered. Whenever the second stack is empty and we need to do one of its operations, we shift elements from the first stack to the second.
    
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        Scanner scan = new Scanner(System.in);
        int queries = scan.nextInt();

        for (int i = 0; i < queries; i++) { //Read all the values
            int operation = scan.nextInt(); //Check value
            if (operation == 1)                // Enqueue
                queue.enqueue(scan.nextInt());
            else if (operation == 2)         // Dequeue front element
                queue.dequeue();
            else if (operation == 3)        // Print front element
                System.out.println(queue.front());
        }
        
        scan.close();
    }
    
    public static class MyQueue { //Our queue with two stacks
        private Stack<Integer> stack_insert = new Stack<>(); //Used for inserting
        private Stack<Integer> stack_print = new Stack<>(); //Used for printing
        
        public void enqueue(Integer num) {
            stack_insert.push(num);
        }
        
        public Integer dequeue() {
            if (size() == 0)
                return null;
            else if (stack_print.isEmpty()) 
                shiftStacks();
            
            return stack_print.pop();
        }
        
        public Integer front() {
            if (size() == 0) 
                return null;                
            else if (stack_print.isEmpty()) 
                shiftStacks();
                
            return stack_print.peek();
        }
        
        // Changes values 
        private void shiftStacks() {
            if (stack_print.isEmpty()) //If there are not more element for printing, move elements
                while (!stack_insert.isEmpty()) //Insert all the elements into the printing stack
                    stack_print.push(stack_insert.pop());
        }
        
        public int size() {
            return stack_insert.size() + stack_print.size();
        }
    }
}

