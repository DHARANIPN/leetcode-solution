// Last updated: 7/13/2026, 8:58:49 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int total = 0;
18    public int pathSum(TreeNode root, int sum) {
19        if(root == null) return 0;
20        helper(root, sum, 0);
21        pathSum(root.left, sum);
22        pathSum(root.right, sum);
23        return total;
24    }
25
26    void helper(TreeNode root, int sum, long curr) {
27        if(root == null) return;
28        curr += root.val;
29        if(curr == sum) total++;
30        helper(root.left, sum, curr);
31        helper(root.right, sum, curr);
32    }
33}