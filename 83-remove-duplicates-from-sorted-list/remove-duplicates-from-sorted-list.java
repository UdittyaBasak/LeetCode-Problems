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
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null){
            return null;
        }

        ListNode curr_Node = head;


        while (curr_Node!=null && curr_Node.next!=null){
            if (curr_Node.val == curr_Node.next.val){
                curr_Node.next = curr_Node.next.next;
            } else {
                curr_Node = curr_Node.next; 
            }
        }

        return head;
    }
}