// Last updated: 6/28/2026, 9:23:25 PM
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
17    private int numOfCameras = 0;
18    
19    public int minCameraCover(TreeNode root) {
20        return dfs(root) == -1 ? numOfCameras + 1 : numOfCameras;
21    }
22
23    private int dfs(TreeNode root) {
24        if (root == null) return 0;
25        
26        int left = dfs(root.left);
27        int right = dfs(root.right);
28        
29        if (left == -1 || right == -1) {
30            numOfCameras++;
31            return 1; 
32        }
33        
34        if (left == 1 || right == 1)
35            return 0; 
36        
37        return -1;
38    }
39}