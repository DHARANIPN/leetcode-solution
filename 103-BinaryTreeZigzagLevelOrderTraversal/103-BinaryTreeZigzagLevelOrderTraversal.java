// Last updated: 6/11/2026, 3:41:20 PM
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
17    public List<Integer> rightSideView(TreeNode root) {
18        List<Integer> ans = new ArrayList<>();
19        if(root == null) return ans;
20        Queue<TreeNode> q = new LinkedList<>();
21        q.add(root);
22        while(!q.isEmpty()){
23            int s = q.size();
24         
25            for(int i=0;i<s;i++){
26                TreeNode t = q.remove();
27                if(i==s-1){
28                    ans.add(t.val);
29                }
30                if(t.left!=null){
31                    q.add(t.left);
32                }
33                 if(t.right!=null){
34                    q.add(t.right);
35                }
36              
37            }
38            
39        }
40        return ans;
41    }
42}