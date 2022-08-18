//Link: https://www.hackerrank.com/challenges/tree-top-view/problem

import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

    static class structNodeKey {
        Node node;
        int key; //value for top view

        structNodeKey(Node node, int key)
        {
            this.node = node;
            this.key = key;
        }
    }  
    
	/*     
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/

    
	public static void topView(Node root) {
    
        Queue<structNodeKey> queue = new LinkedList<structNodeKey>();
        Map<Integer, Node> topViewMap = new TreeMap<Integer, Node>();
        structNodeKey tmp;
 
        if (root == null) {
            return;
        }
        else {
            queue.add(new structNodeKey(root, 0)); //first value is 0
        }
        
        while(!queue.isEmpty())
        {
            tmp = queue.poll();
            
            if(!topViewMap.containsKey(tmp.key)){
                topViewMap.put(tmp.key, tmp.node);
            }
            
            if(tmp.node.left != null){
                queue.add(new structNodeKey(tmp.node.left, tmp.key-1));    
            }   
            
            if(tmp.node.right != null){
                queue.add(new structNodeKey(tmp.node.right, tmp.key+1));                 
            }
        }
        
        for(Map.Entry<Integer, Node> entry : topViewMap.entrySet()){
            System.out.print(entry.getValue().data+" ");
        }
    }