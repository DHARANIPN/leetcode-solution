// Last updated: 2/6/2026, 10:45:59 AM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd =0;
        int even =0;
        for(int pos :position){
            if(pos %2==0) even++;
            else odd++;
        }return (even<odd)?even:odd;
    }
}