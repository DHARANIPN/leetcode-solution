// Last updated: 6/9/2026, 3:44:05 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteMiddle(ListNode head) {
13        if(head==null || head.next==null) return null;
14        ListNode temp1 = head;
15        ListNode temp2 = head;
16        ListNode prev = null;
17        while(temp2!=null && temp2.next!=null){
18            prev = temp1;
19            temp1 = temp1.next;
20            temp2 = temp2.next.next;
21        }    
22     
23        prev.next = temp1.next;
24        
25        return head;
26    }
27}