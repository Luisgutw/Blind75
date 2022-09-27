package Code;


import DataStructure.ListNode;

public class RemoveNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode toDelete = head;
        ListNode prev = null;
        ListNode res = head;
        int count = 0;
        while (head != null) {
            count++;
            if (count > n) {
                prev = toDelete;
                toDelete = toDelete.next;
            }
            head = head.next;
        }
        if (count == n) return res.next;
        if (toDelete != null)
            prev.next = toDelete.next;
        return res;
    }

}
