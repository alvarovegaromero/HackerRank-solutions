//https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem
    
    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        if (head1 == null)
            return head2;
        if (head2 == null) 
            return head1;

        SinglyLinkedListNode mergedHead, current;
        
        if (head1.data <= head2.data) {
            mergedHead = head1;
            head1 = head1.next;
        } else {
            mergedHead = head2;
            head2 = head2.next;
        }

        current = mergedHead;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            
            current = current.next;
        }

        if (head1 != null) {
            current.next = head1;
        } else {
            current.next = head2;
        }

        return mergedHead;
    }
