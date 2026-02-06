// Last updated: 2/6/2026, 10:45:15 AM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count =0;
        for(int i =0;i<hours.length;i++){
            if(hours[i] >= target) count++;
        }
        return count;
    }
}