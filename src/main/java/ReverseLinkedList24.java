/**
 * Created by kmg on 2016-01-13.
 */
public class ReverseLinkedList24 {

    /**
     * Write a function for reversing a linked list ↴ . Do it in-place ↴ .
     * <p/>
     * Your function will have one input: the head of the list.
     * <p/>
     * Your function should return the new head of the list.
     * <p/>
     * Here's a sample linked list node class:
     */
    public static class LinkedListNode {

        public int value;
        public LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "LinkedListNode{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {


        LinkedListNode head = new LinkedListNode(0);

        LinkedListNode one = new LinkedListNode(1);

        LinkedListNode two = new LinkedListNode(2);
        LinkedListNode three = new LinkedListNode(3);
        head.next = one;
        one.next = two;
        two.next = three;
        three.next = null;

        System.out.println(head);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);


        LinkedListNode rememberLast = head;
        LinkedListNode node = head.next;
        rememberLast.next = null;
        if (head != null && head.next != null) {
            while (node.next != null) {

                LinkedListNode temp = node.next;
                node.next = rememberLast;
                rememberLast = node;
                node = temp;

            }
            node.next = rememberLast;
        }

        System.out.println(head);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);


    }
    /**
     * solution
     *   public LinkedListNode reverse(LinkedListNode headOfList) {
     LinkedListNode current = headOfList;
     LinkedListNode previous = null;
     LinkedListNode nextNode = null;

     // until we have 'fallen off' the end of the list
     while (current != null) {

     // copy a pointer to the next element
     // before we overwrite current.next
     nextNode = current.next;

     // reverse the 'next' pointer
     current.next = previous;

     // step forward in the list
     previous = current;
     current = nextNode;
     }

     return previous;
     }
     */

}
