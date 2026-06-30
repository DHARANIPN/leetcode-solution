// Last updated: 6/30/2026, 9:49:08 AM
1class Solution {
2    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
3        ListNode temp = l1;
4        ListNode t = l2;
5        ListNode dummy = new ListNode(0);
6        ListNode curr = dummy;
7        int carry = 0;
8        
9        // Fixed: Use || instead of && so it processes the longer list completely
10        while (temp != null || t != null || carry != 0) {
11            int sum = carry;
12            
13            if (temp != null) {
14                sum += temp.val;
15                temp = temp.next;
16            }
17            if (t != null) {
18                sum += t.val;
19                t = t.next;
20            }
21            
22            carry = sum / 10;
23            curr.next = new ListNode(sum % 10);
24            curr = curr.next;
25        }
26        return dummy.next;
27    }
28}