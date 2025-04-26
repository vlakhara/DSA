/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {


        ListNode middle = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {
            middle = middle.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverse(middle.next);

        ListNode firstHalf = head;

        while(firstHalf != null && secondHalf != null) {
            if(firstHalf.val != secondHalf.val) {
                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static ListNode reverse(ListNode node) {
        if(node == null || node.next == null) {
            return node;
        }

        ListNode current = node;
        ListNode prev = null;

        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}