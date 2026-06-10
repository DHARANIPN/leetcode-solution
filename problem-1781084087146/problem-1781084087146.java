// Last updated: 6/10/2026, 3:04:47 PM
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>> ans = new ArrayList<>();
19        if(root == null) return ans;
20        // List<Integer> arr = new ArrayList<>();
21        // arr.add(root.val);
22        // ans.add(arr);
23        Queue<TreeNode> q = new LinkedList<>();
24        q.add(root);
25        while(!q.isEmpty()){
26            int s = q.size();
27            List<Integer> temp = new ArrayList<>();
28            for(int i=0;i<s;i++){
29                TreeNode t = q.poll();
30                temp.add(t.val);
31                if(t.left!=null) {
32                    q.add(t.left);
33                }
34                if(t.right != null) {
35                    q.add(t.right);
36                }
37            }
38            ans.add(temp);
39        }
40         return ans;
41    }
42}
43