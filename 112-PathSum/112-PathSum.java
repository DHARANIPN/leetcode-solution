// Last updated: 6/11/2026, 8:47:50 AM
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
17    public boolean hasPathSum(TreeNode root, int targetSum) {
18         if (root == null) return false;
19
20        if (root.left == null && root.right == null) {
21            if (targetSum - root.val == 0) return true;
22            else return false;
23        }
24
25        targetSum -= root.val;
26
27        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);       
28    }
29}