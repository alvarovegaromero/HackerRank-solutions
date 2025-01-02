//https://www.hackerrank.com/challenges/reverse-a-linked-list/problem

class Result {

    /*
     * Complete the 'reverse' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        SinglyLinkedListNode previous = null;
        SinglyLinkedListNode current = llist;
        SinglyLinkedListNode nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = previous;
            previous = current;
            
            current = nextNode; 
        }

        return previous; 
    }
}