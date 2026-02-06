// Last updated: 2/6/2026, 10:45:14 AM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
     int U = purchaseAmount % 10;
     if(U<=4){
       return 100 - (purchaseAmount / 10)*10;
     }
     else{
        return 100 - ((purchaseAmount / 10)+1)*10;
     }
         
    }
}