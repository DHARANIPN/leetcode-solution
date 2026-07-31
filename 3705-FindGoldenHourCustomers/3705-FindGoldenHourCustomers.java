// Last updated: 7/31/2026, 8:35:51 AM
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
17    private TreeNode prev = null;
18
19public void flatten(TreeNode root) {
20    if (root == null)
21        return;
22    flatten(root.right);
23    flatten(root.left);
24    root.right = prev;
25    root.left = null;
26    prev = root;
27}
28}