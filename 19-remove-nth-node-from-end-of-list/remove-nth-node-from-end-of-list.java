/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int total = totalNodes(head);

        if(total == 1 && n == 1) {
            return null;
        }

        int pos = total - n;

        if(pos == 0) {
            head = head.next;
            return head;
        }

        ListNode temp = head;

        for (int i = 0; i < pos - 1; i++) { // 1 2
            temp = temp.next;
        }

        if(temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }

    private static int totalNodes(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
}