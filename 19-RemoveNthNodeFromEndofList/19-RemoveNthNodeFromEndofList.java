// Last updated: 7/12/2026, 9:43:53 PM
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        if(head.next == null) return null;
14        ListNode slow = head;
15        ListNode fast = head;
16        int i =1;;
17        while(i<=n){
18            slow = slow.next;
19            i++;
20        }
21        if(slow == null){
22           return head.next;
23        }
24        while(slow.next!=null){
25            slow = slow.next;
26            fast = fast.next;
27        }
28        if(fast.next!=null){
29            fast.next = fast.next.next;
30        }
31        return head;
32
33    }
34}