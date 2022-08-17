//Link: https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem

class Result {

    /*
     * Complete the 'reverse' function below.
     *
     * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
     * The function accepts INTEGER_DOUBLY_LINKED_LIST llist as parameter.
     */

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
}


    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
    // Write your code here
    
        //Variables used. Representing the actual, previous and next node used
        DoublyLinkedListNode previous = null; //Initial parameter
        DoublyLinkedListNode next; 
        DoublyLinkedListNode actual = llist;
        
        while(actual != null) //While it's not the end (or empty list)
        {
            next = actual.next; //Save the next
            
            actual.next = previous; //Switch the values
            actual.prev = next;
            
            previous = actual; //Continue with the list
            actual = next;            
        }
        
        return previous;
    }