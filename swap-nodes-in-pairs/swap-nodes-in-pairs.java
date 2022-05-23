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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode current=head;
        swap(current,current.next);
        return head;
    }
    
    void swap(ListNode current,ListNode next){
        int temp=current.val;
        current.val=next.val;
        next.val=temp;
         if(next.next==null||next.next.next==null){
            return;
        }
        swap(next.next,next.next.next);
    }
    
}