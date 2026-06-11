// Last updated: 6/11/2026, 2:04:12 PM
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> ans = new ArrayList<>();
19        if(root == null) return ans;
20        Queue<TreeNode> q = new LinkedList<>();
21        q.add(root);
22        boolean isLeftToRight = true;
23         while(!q.isEmpty()){
24            int s = q.size();
25            List<Integer> temp = new ArrayList<>();
26            
27            for(int i=0;i<s;i++){
28                TreeNode t = q.poll();
29                  if(isLeftToRight ==true ) {
30                    temp.add(t.val);
31                }
32                else{
33                    temp.add(0,t.val);
34                }
35                if(t.left!=null) q.add(t.left);
36                if(t.right!=null)q.add(t.right);
37    
38            }
39            ans.add(temp);
40            isLeftToRight = !isLeftToRight;
41        }
42         return ans;
43    }
44}
45
46        
47    