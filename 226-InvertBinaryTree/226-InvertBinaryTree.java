// Last updated: 7/13/2026, 9:00:18 AM
1class Solution {
2    public int maxFrequency(int[] nums, int k) {
3        int maxFrequency = 0; // Initialize the maximum frequency
4        long currentSum = 0; // Initialize the current sum of the subarray elements
5
6        Arrays.sort(nums); // Sort the array in ascending order
7
8        for (int left = 0, right = 0; right < nums.length; ++right) {
9            currentSum += nums[right]; // Include the current element in the subarray sum
10
11            // Check if the current subarray violates the condition (sum + k < nums[right] * length)
12            while (currentSum + k < (long) nums[right] * (right - left + 1)) {
13                currentSum -= nums[left]; // Adjust the subarray sum by removing the leftmost element
14                left++; // Move the left pointer to the right
15            }
16
17            // Update the maximum frequency based on the current subarray length
18            maxFrequency = Math.max(maxFrequency, right - left + 1);
19        }
20
21        return maxFrequency;
22    }
23}