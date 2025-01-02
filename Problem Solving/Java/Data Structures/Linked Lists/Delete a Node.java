//https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem

class Result {

    /*
     * Complete the 'deleteNode' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER position
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

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        if(position == 0){
            return llist.next;
        }
        
        SinglyLinkedListNode previous = null;
        SinglyLinkedListNode current = llist;
        
        for(int i = 0 ; i < position ; i++){
            previous = current; 
            current = current.next;
        }
        
        previous.next = current.next;
        
        return llist;
    }
}