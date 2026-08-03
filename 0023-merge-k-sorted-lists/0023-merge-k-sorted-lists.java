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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ArrayList<ListNode> a=new ArrayList<>();
        ArrayList<ListNode> b=new ArrayList<>();
        for(ListNode n : lists) a.add(n);
        while(a.size()+b.size()>1){
            while(!a.isEmpty()){
                if (a.size() == 1) {
                    b.add(a.remove(a.size() - 1));
                    break;
                }
                ListNode i=a.remove(a.size()-1);
                ListNode j=a.remove(a.size()-1);
                ListNode k=merge(i,j);
                b.add(k);
            }
            while(b.size()!=0){
                if (b.size() == 1) {
                    a.add(b.remove(b.size() - 1));
                    break;
                }
                ListNode i=b.remove(b.size()-1);
                ListNode j=b.remove(b.size()-1);
                ListNode k=merge(i,j);
                a.add(k);
            }


        }
        if (!a.isEmpty()) return a.get(0);
        return b.get(0);


        
    }
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if (l1 != null) temp.next = l1;
        if (l2 != null) temp.next = l2;

        return dummy.next;
    }
}
