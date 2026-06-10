// Last updated: 6/10/2026, 10:13:51 AM
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
12    public int GCD(int a,int b){
13        if(b == 0) return a;
14        else{
15            return GCD(b, a % b);
16        }
17    }
18    public ListNode insertGreatestCommonDivisors(ListNode head) {
19         if(head == null || head.next==null){
20            return head;
21        }
22        ListNode current = head;
23        while(current.next!=null){
24            int gcd = GCD(current.val,current.next.val);
25            ListNode new_node = new ListNode(gcd);
26            new_node.next = current.next;
27            current.next = new_node;
28            current = current.next.next;
29        }
30        return head;
31    }
32}