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
    public ListNode addTwoNumbers(ListNode I1, ListNode I2) {
        ListNode mMm = new ListNode (0);
        ListNode nnn = mMm;
        int lll = 0;
        while (I1 !=  null || I2 !=null || lll !=0){
            int j =(I1 != null) ? I1.val : 0;
            int jj =(I2 != null) ? I2.val : 0;
            int sum = lll+j+jj;
            lll=sum/10;
            nnn.next = new ListNode(sum%10);
            nnn= nnn.next;
            if (I1 != null)
            I1 = I1.next;
            if (I2 != null)
            I2 = I2.next;                    }
            return mMm.next;
    }
}