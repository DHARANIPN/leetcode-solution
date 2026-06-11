// Last updated: 6/11/2026, 9:26:56 AM
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
17    public int countNodes(TreeNode root) {
18        List<Integer> arr = new ArrayList<>();
19        Preorder(root,arr);
20        return arr.size();
21    }
22    void Preorder(TreeNode root, List<Integer> arr){
23        if(root == null) return;
24        arr.add(root.val);
25        Preorder(root.left,arr);
26        Preorder(root.right,arr);
27    }
28        
29    }
30