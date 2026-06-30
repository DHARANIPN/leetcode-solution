// Last updated: 6/30/2026, 9:16:28 AM
1class Solution {
2    public int shortestPathLength(int[][] graph) {
3        int n = graph.length;
4        if (n == 1) return 0; 
5        int r = (int) Math.pow(2, n); 
6        int c = n;
7        int[][] dist = new int[r][c];
8        
9        for (int i = 0; i < r; i++) {
10            Arrays.fill(dist[i], -1);
11        }
12        
13        Queue<int[]> q = new LinkedList<>();
14        for (int i = 0; i < n; i++) {
15            int lead = i;
16            int mask = 1 << i; 
17            q.add(new int[]{lead, mask});
18            dist[mask][lead] = 0;
19        }
20    
21        int allVisitedMask = (1 << n) - 1;
22        
23        while (q.size() > 0) {
24            int size = q.size();
25            for (int j = 0; j < size; j++) { 
26                int[] path = q.remove();
27                int currLead = path[0];   
28                int currMask = path[1];
29                if (currMask == allVisitedMask) {
30                    return dist[currMask][currLead];
31                }
32              
33                for (int neighbor : graph[currLead]) {
34                    int nextMask = currMask | (1 << neighbor); 
35                    
36                    if (dist[nextMask][neighbor] == -1) {
37                        dist[nextMask][neighbor] = dist[currMask][currLead] + 1;
38                        q.add(new int[]{neighbor, nextMask});
39                    }
40                }
41            }
42        }
43        
44        return -1;
45    }
46}