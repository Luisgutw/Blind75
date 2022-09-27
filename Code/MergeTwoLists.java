package Code;

import DataStructure.ListNode;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode crr = result;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                crr.next = new ListNode(list1.val);
                list1 = list1.next;
                crr = crr.next;
            } else {
                crr.next = new ListNode(list2.val);
                list2 = list2.next;
                crr = crr.next;
            }
        }
        if (list1 == null) {
            crr.next = list2;
        } else {
            crr.next = list1;
        }
        return result.next;
    }
}
