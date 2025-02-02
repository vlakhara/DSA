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
    public void reorderList(ListNode head) {
        // {0:1}{1:2}{2:3}{3:4}{4:5}
        List<Integer> keep = new ArrayList<>();
        ListNode temp = head;
        while(temp != null) {
            keep.add(temp.val);
            temp = temp.next;
        }

        boolean flag = true;
        int i = 0;
        int j = keep.size() - 1;

        temp = head;

        while(i <= j) {
            if(flag) {
                temp.val = keep.get(i++);
            } else {
                temp.val = keep.get(j--);
            }
            temp = temp.next;
            flag = !flag;
        }
        
    }
}