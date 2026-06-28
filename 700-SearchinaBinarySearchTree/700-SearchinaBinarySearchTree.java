// Last updated: 6/28/2026, 9:06:19 PM
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
17    public TreeNode searchBST(TreeNode root, int val) {
18        if(root == null) return null;
19        else if(val>root.val) return searchBST(root.right,val);
20        else if(val<root.val) return searchBST(root.left,val);
21        return root;
22
23        
24    }
25}