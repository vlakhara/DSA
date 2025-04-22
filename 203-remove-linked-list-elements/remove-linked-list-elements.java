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
    public ListNode removeElements(ListNode head, int val) {

        while(head != null && head.val == val) {
            head = head.next;
        }

        if(head == null) {
            return head;
        }

        ListNode temp = head;
        remove(temp, temp.next, val);

        return head;
    }

    /**
    
    1 2
    2 6 -> 2 3
    3 4 
    4 5
    5 6 -> 5

     */

    public static void remove(ListNode left, ListNode right, int val) {
        if(right == null) {
            return;
        }

        if(right.val == val) {
            left.next = right.next;
            remove(left, left.next, val);
        } else {
            remove(left.next, right.next, val);
        }
    } 
}