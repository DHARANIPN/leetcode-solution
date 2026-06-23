// Last updated: 6/23/2026, 7:40:45 PM
1class Solution {
2
3    public long maxSum(int[] nums, int k) {
4        int[] copy = Arrays.copyOf(nums, nums.length);
5        long output = -150000000;
6        TreeMap<Integer, Integer> candidates = new TreeMap<>(), others = new TreeMap<>();
7        Arrays.sort(copy);
8        for (int i = 0; i < nums.length; i++) {
9            long m = 0;
10             for (int j = 0; j < nums.length - k; j++)
11                others.put(copy[j], others.getOrDefault(copy[j], 0) + 1);
12            for (int j = nums.length - k; j < nums.length; j++)
13                candidates.put(copy[j], candidates.getOrDefault(copy[j], 0) + 1);
14            for (int j = i; j < nums.length; j++) {
15                  if (!others.isEmpty()) {
16                    int key = others.containsKey(nums[j]) ? nums[j] : others.lastKey(), value = others.get(key);
17                    candidates.put(key, candidates.getOrDefault(key, 0) + 1);
18                    if (value == 1)
19                        others.remove(key);
20                    else
21                        others.put(key, others.get(key) - 1);
22                }
23                 m += candidates.lastKey();
24                int key = candidates.lastKey(), value = candidates.lastEntry().getValue();
25                if (value == 1)
26                    candidates.remove(key);
27                else
28                    candidates.put(key, value - 1);
29                output = Math.max(m, output);
30            }
31            candidates.clear();
32            others.clear();
33        }
34        return output;
35    }
36
37}