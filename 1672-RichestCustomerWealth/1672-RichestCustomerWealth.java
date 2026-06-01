// Last updated: 6/1/2026, 8:58:20 AM
1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int rich = 0;
4        for (int[] i : accounts) {
5            int sum = 0;
6            for (int money : i) {
7                sum += money;
8            }
9            rich = Math.max(rich, sum);
10        }
11        return rich;
12    }
13}