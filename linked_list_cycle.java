public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;

        if (head == null) return false;

        do {
            p2 = p2.next;
            if (p2 == null) return false;
            p2 = p2.next;
            if (p2 == null) return false;

            p1 = p1.next;

            if (p1.equals(p2)) return true;
        } while (true);
    }
}
