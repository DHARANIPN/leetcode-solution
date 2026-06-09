// Last updated: 6/9/2026, 12:21:54 PM
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
13    public ListNode detectCycle(ListNode head) {
14        ListNode temp1 = head;
15        ListNode temp2 = head;
16        while(temp2!=null && temp2.next!=null){
17            temp1 = temp1.next;
18            temp2 = temp2.next.next;
19            if(temp1==temp2){
20               while(head!=temp2){
21                head = head.next;
22                temp2 = temp2.next;
23               }
24               return head;
25            }
26        }
27          return null ;
28    }
29}