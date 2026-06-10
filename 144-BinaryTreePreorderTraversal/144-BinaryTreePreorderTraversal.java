// Last updated: 6/10/2026, 1:43:11 PM
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
17    public List<Integer> postorderTraversal(TreeNode root) {
18        List<Integer> arr = new ArrayList<>();
19        Postorder(root,arr);
20        return arr;
21    }
22    void Postorder(TreeNode root, List<Integer> arr){
23        if(root == null) return;
24        Postorder(root.left,arr);
25        Postorder(root.right,arr);
26        arr.add(root.val);
27    }
28        
29}
30