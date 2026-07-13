// Last updated: 7/13/2026, 8:58:57 AM
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
17    public TreeNode invertTree(TreeNode root) {
18       
19        if(root==null || (root.left==null && root.right==null)){
20            return root;
21        }      
22        Queue<TreeNode> q = new LinkedList<>();
23        q.offer(root);
24        while(!q.isEmpty()){
25            int a = q.size();
26            List<Integer> l = new ArrayList<>();
27            while(a>0){
28                TreeNode curr = q.poll();
29                if(curr.left !=null || curr.right !=null){
30                    TreeNode p= curr.left;
31                    curr.left=curr.right;
32                    curr.right=p;
33                }
34                if(curr.left!=null) q.offer(curr.left);
35                if(curr.right!=null) q.offer(curr.right);
36                a--;
37            }
38           
39        }
40        return root;
41    }
42}