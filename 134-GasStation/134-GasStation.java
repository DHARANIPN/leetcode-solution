// Last updated: 2/6/2026, 10:46:42 AM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0;
        int remainingGas = 0;
        int answer = 0;
        for(int i = 0;i<gas.length;i++){
            totalCost += gas[i] - cost[i];
            remainingGas += gas[i] - cost[i];
            if(remainingGas < 0){
                remainingGas = 0;
                answer = i+1;
            }
        } 
        return totalCost >= 0 ? answer:-1;
    }
}