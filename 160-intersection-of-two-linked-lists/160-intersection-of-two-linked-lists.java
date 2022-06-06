/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA=0,countB=0;
        ListNode tempA=headA,tempB=headB;
        while(tempA!=null){
           countA++;
            tempA=tempA.next;
        }
          while(tempB!=null){
           countB++;
            tempB=tempB.next;
        }
        ListNode tA=headA,tB=headB;
        if(countA>countB){
            int skip=countA-countB;
            while(skip-->0){
            tA=tA.next;
        }
        }else{
            int skip=countB-countA;
            while(skip-->0){
                tB=tB.next;
            }
        }
        
        while(tA!=null){
            if(tA==tB){
                return tA;
            }
            tA=tA.next;
            tB=tB.next;
        }
        
        return null;
    }
}