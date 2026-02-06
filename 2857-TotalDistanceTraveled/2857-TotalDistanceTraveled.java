// Last updated: 2/6/2026, 10:45:16 AM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int Total = 0;
        while(mainTank>=5){
            Total+=50;
            mainTank-=5;
            if(additionalTank>=1){
                mainTank++;
                additionalTank--;
            }
        }
        return Total+(mainTank*10);
    }
}