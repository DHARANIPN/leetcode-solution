// Last updated: 6/28/2026, 9:27:15 PM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> adj = new ArrayList<>();
4        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());
5
6        int[] indegree = new int[numCourses];
7        for (int[] pre : prerequisites) {
8            adj.get(pre[1]).add(pre[0]);
9            indegree[pre[0]]++;
10        }
11
12        Queue<Integer> q = new LinkedList<>();
13        for (int i = 0; i < numCourses; i++)
14            if (indegree[i] == 0) q.add(i);
15
16        int count = 0;
17        while (!q.isEmpty()) {
18            int node = q.poll();
19            count++;
20
21            for (int next : adj.get(node)) {
22                indegree[next]--;
23                if (indegree[next] == 0) q.add(next);
24            }
25        }
26
27        return count == numCourses;
28    }
29}