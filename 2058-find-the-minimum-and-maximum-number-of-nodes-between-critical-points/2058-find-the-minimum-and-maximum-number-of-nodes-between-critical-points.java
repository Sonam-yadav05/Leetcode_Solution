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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans={-1,-1};
        if(head.next.next==null) return ans;
        ListNode a=head;
        ListNode b=head.next;
        ListNode c=head.next.next;
        int idx=1;
        int fidx=-1;
        int lidx=-1;
        int cidx=-1;
        int min=Integer.MAX_VALUE;
        while(c!=null){
            if((b.val > a.val && b.val > c.val)||(b.val < a.val && b.val < c.val)){
                if(fidx==-1) fidx=idx;
                lidx=idx;
                if(cidx!=-1 && lidx-cidx < min){
                    min=lidx-cidx;
                }
                cidx=lidx;
                idx++;
            }
            else idx++;
            c=c.next;
            b=b.next;
            a=a.next;
        }
        int max=lidx-fidx;
        if(fidx!=-1 && fidx!=lidx){
            ans[0]=min;
            ans[1]=max;
            return ans;
        }
        return ans;
        
    }
}