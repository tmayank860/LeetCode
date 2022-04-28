/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
          ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    
//     public boolean hasCycle(ListNode head) {
//         if(head==null){
//             return false;
//         }
//         Set<ListNode> hs=new HashSet<>();
//         ListNode current=head;
//         while(current.next!=null){
//             if(hs.contains(current)){
//                 return true;
//             }
//             hs.add(current);
//             current=current.next;
            
           
//         }
//         return false;
//     }
    
}