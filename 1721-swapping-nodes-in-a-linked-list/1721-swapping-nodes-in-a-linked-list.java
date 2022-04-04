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
    public ListNode swapNodes(ListNode head, int k) {
     List<ListNode> ls=new ArrayList<>();
        ListNode current=head;
        while(current!=null){
            ls.add(current);
            current=current.next;
        }
        int size=ls.size();
        int swap=size-k+1;
        int temp=ls.get(k-1).val;
        ls.get(k-1).val=ls.get(swap-1).val;
        ls.get(swap-1).val=temp;
        return head;
        
    }
}