/**
 * https://leetcode.com/problems/add-two-numbers/
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode res = new ListNode(0);
        ListNode temp3 = res;
        int carry = 0;
        while(temp1 != null || temp2 != null){
            int m = (temp1!=null)? temp1.val: 0;
            int n = (temp2!=null)? temp2.val: 0;
            int sum = carry + m +n;
            carry = sum/10;
            temp3.next = new ListNode(sum%10);
            temp3 = temp3.next;
            if(temp1!=null) temp1 = temp1.next;
            if(temp2!=null) temp2 = temp2.next;
        }
        if(carry > 0){
            temp3.next = new ListNode(carry);
        }
        return res.next;
    }
}
