// Last updated: 6/9/2026, 11:42:29 AM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        ListNode temp1 = head;
15        ListNode temp2 = head;
16        while(temp2!=null && temp2.next!=null){
17            temp1 = temp1.next;
18            temp2 = temp2.next.next;
19            if(temp1==temp2){
20                return true;
21            }
22        }
23        return false;
24    }
25}