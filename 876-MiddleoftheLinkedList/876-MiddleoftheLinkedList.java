// Last updated: 6/9/2026, 11:31:44 AM
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
12    public ListNode middleNode(ListNode head) {
13       
14        ListNode temp1 = head;
15        ListNode temp2 = head;
16        while(temp2!=null && temp2.next!=null){
17            temp1 = temp1.next;
18            temp2 = temp2.next.next;
19        }
20        return temp1;
21    }
22}