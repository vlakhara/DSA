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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addNumbers(l1, l2, 0);
        // ListNode ans = new ListNode();
        // ListNode temp = ans;

        // int carry = 0;
        // while(l1 != null || l2 != null || carry > 0) {

        //     int sum = carry;
            
        //     if(l1 != null) {
        //         sum += l1.val;
        //         l1 = l1.next;
        //     }

        //     if(l2 != null) {
        //         sum += l2.val;
        //         l2 = l2.next;
        //     } 

        //     carry = sum / 10;
        //     sum = sum % 10;
        //     temp.next = new ListNode(sum);


        //     temp = temp.next;

        // }

        // return ans.next;
    }

    public static ListNode addNumbers(ListNode l1, ListNode l2, int carry) {

            if(l1 == null && l2 == null && carry <= 0) {
                return null;
            }

            int sum = carry;
            
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            } 

            ListNode temp = new ListNode(sum % 10);
            temp.next = addNumbers(l1, l2, sum / 10);

            return temp;
    }
}