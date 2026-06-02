// Last updated: 6/2/2026, 2:48:05 PM
1class Solution {
2    public String triangleType(int[] nums) {
3        Arrays.sort(nums);
4        Set<Integer> set = new HashSet<>();
5        for (int num : nums) set.add(num);
6
7        if (nums[0] + nums[1] <= nums[2]) return "none";
8        if (set.size() == 1) return "equilateral";
9        if (set.size() == 2) return "isosceles";
10        return "scalene";
11    }
12}