// Last updated: 6/11/2026, 1:36:49 PM
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
17    public TreeNode deleteNode(TreeNode root,int key){
18        if(root==null) return null;
19        //checking /finding the value
20        if(key<root.val) root.left=deleteNode(root.left,key);
21        else if (key>root.val) root.right=deleteNode(root.right,key);
22        //No children 
23        else {
24            if(root.left == null && root.right==null) root = null;
25            else if(root.left == null || root.right==null){
26                if(root.left == null) {root = root.right;}
27                else{ root = root.left;}
28            }
29            else{
30                TreeNode min = deletenode(root.right);
31                root.val = min.val;
32                root.right=deleteNode(root.right,min.val);
33            }
34         
35
36
37    }
38    return root;
39    }
40    private TreeNode deletenode(TreeNode root) {
41        while(root.left!=null){
42            root=root.left;
43        }
44        return root;
45    }
46}