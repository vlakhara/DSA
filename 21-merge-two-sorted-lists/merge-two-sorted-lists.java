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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }

        // Set head
        ListNode head = new ListNode();
        head.val = Math.min(list1.val, list2.val);

        if(list1.val < list2.val) {
            list1 = list1.next;
        } else {
            list2 = list2.next;
        }

        ListNode temp = head;

        while(list1 != null && list2 != null) {

            ListNode newNode = new ListNode(Math.min(list1.val, list2.val));

            if(list1.val < list2.val) {
                list1 = list1.next;
            } else {
                list2 = list2.next;
            }

            temp.next = newNode;
            temp = newNode;
        }

        // if (list1 != null) {
        //     temp.next = list1;
        // } else {
        //     temp.next = list2;
        // }

        while(list1 != null) {
            ListNode newNode = new ListNode(list1.val);
            temp.next = newNode;
            temp = newNode; 
            list1 = list1.next;
        }

        while(list2 != null) {
            ListNode newNode = new ListNode(list2.val);
            temp.next = newNode;
            temp = newNode; 
            list2 = list2.next;
        }

        return head;

    }
}