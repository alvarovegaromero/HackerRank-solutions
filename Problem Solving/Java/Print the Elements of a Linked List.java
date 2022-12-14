//Link: https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem

// Complete the printLinkedList function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode current_node = head;
        
        while(current_node != null)
        {
            System.out.println(current_node.data);
            current_node = current_node.next;
        }

    }