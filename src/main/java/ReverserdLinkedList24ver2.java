/**
 * Created by Marcin Gumkowski on 2016-08-30.
 */
public class ReverserdLinkedList24ver2 {

    public static LinkedListNode reverse(LinkedListNode head) {

        LinkedListNode prev = null;
        LinkedListNode cur = head;
        while (cur.next != null) {
            LinkedListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        cur.next = prev;
        return cur;


    }

    public static void main(String[] args) {

        LinkedListNode a = new LinkedListNode(1);
        LinkedListNode b = new LinkedListNode(2);
        LinkedListNode c = new LinkedListNode(3);
        LinkedListNode d = new LinkedListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        LinkedListNode x = reverse(a);
        System.out.println(x.value);


    }

    public static class LinkedListNode {

        public int value;
        public LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }
    }

}
