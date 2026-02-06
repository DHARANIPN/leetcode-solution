// Last updated: 2/6/2026, 10:45:01 AM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        int index = 0;
        for(int i = 0;i<order.length;i++){
            for (int j = 0;j<friends.length;j++){
                if(order[i]==friends[j]){
                    ans[index++] = order[i];
                }
            }
        }return ans;
    }
}