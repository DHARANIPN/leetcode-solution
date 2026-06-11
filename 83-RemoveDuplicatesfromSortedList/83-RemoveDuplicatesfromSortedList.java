// Last updated: 6/11/2026, 8:37:53 AM
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
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode a = head;
14        if(head == null || head.next==null) return head;
15        while(a!=null && a.next!=null){
16            if(a.val==a.next.val) a.next = a.next.next;
17            else a = a.next;
18        }
19        return head;
20        
21    }
22}