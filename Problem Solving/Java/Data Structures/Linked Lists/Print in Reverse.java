//https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem

class Result {

    /*
     * Complete the 'reversePrint' function below.
     *
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

    public static void reversePrint(SinglyLinkedListNode llist) {
        Stack<Integer> nodeValues = new Stack<>();
        SinglyLinkedListNode current = llist;
                
        while(current != null){
            nodeValues.add(current.data);
            current = current.next;
        }

        while(!nodeValues.isEmpty()){
            System.out.println(nodeValues.pop());
        }
    }
}