//Link: https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem

// Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
         
        SinglyLinkedListNode last_node = head;
        
        if(last_node == null) ///If it is the first node, change the head to the new one
            head = new_node;
        else 
        //If not, find the last node and change its pointer to the next, to the new_node
        {
            while(last_node.next != null) 
            {
                last_node = last_node.next;
            }
            
            last_node.next = new_node;
        }
        
        return head;

    }