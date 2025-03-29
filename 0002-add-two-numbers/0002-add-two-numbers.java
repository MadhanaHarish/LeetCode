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
    public void addNode(ListNode head, int val) {
        if(head == null) {
            head.val = val;
            head.next = null;
        } else {
            ListNode new_node = new ListNode();
            ListNode temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.val = val;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0, sum;
        ListNode head = new ListNode();
        while(l1 != null || l2 != null || carry > 0) {
            sum = 0;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }    
            if(l2 != null) {
                sum+= l2.val;
                l2 = l2.next;
            }
            sum += carry;
            if(sum > 9) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }
            addNode(head, sum);
        }
        return head.next;
    }
}