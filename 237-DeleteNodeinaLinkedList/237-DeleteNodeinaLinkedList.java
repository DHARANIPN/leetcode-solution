// Last updated: 6/9/2026, 12:14:53 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) { val = x; }
7 * }
8 */
9class Solution {
10    public void deleteNode(ListNode node) {
11    //     ListNode temp = head.next;
12    //     if(head == null || head.next == null) {
13    //         head = null;
14    //     }
15    //     if(temp.next.next!=null){
16    //         temp = temp.next;
17    //     }
18    //     temp.next = null;
19    //    return temp;
20    node.val = node.next.val;
21    node.next = node.next.next;
22    }
23}