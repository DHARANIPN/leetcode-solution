// Last updated: 2/6/2026, 10:45:20 AM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int Sum = arrivalTime+delayedTime;
        if(Sum < 24) return Sum;
        else return Sum - 24;
    }
}