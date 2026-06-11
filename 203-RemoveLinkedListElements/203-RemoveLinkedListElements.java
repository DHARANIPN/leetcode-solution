// Last updated: 6/11/2026, 8:43:28 AM
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
12    public ListNode removeElements(ListNode head, int val) {
13         ListNode temp = new ListNode(0) , curr = temp;
14        temp.next = head;
15        while(curr.next != null ){
16            if(curr.next.val == val) curr.next = curr.next.next;
17            else curr = curr.next;
18        }
19        return temp.next;
20        
21    }
22}