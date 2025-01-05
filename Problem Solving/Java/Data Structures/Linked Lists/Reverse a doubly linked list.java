//https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem

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
    DoublyLinkedListNode previous = null;
    DoublyLinkedListNode next; 
    DoublyLinkedListNode actual = llist;
    
    while(actual != null) {
        next = actual.next;
        
        actual.next = previous;
        actual.prev = next;
        
        previous = actual;
        actual = next;            
    }
    
    return previous;
}