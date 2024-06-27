package DoublyLinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int val) {
        this.val = val;
    }
}

public class palindrome {
    public static boolean isPalindrome(ListNode head, ListNode tail) {
        ListNode t1 = head;
        ListNode t2 = tail;

        while (t1 != null && t2 != null) {
            if (t1.val != t2.val) {
                return false;
            }
            t1 = t1.next;
            t2 = t2.prev;
        }
        return true;
    }

    public static void main(String[] args) {
        // Creating the list 1 -> 0 -> 5 -> 0 -> 1
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(0);
        ListNode c = new ListNode(5);
        ListNode d = new ListNode(0);
        ListNode e = new ListNode(1);

        // head to tail
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // tail to head
        e.prev = d;
        d.prev = c;
        c.prev = b;
        b.prev = a;

        boolean ans = isPalindrome(a, e);
        System.out.println("Is the doubly linked list a palindrome? " + ans);
    }
}

