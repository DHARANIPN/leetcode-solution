// Last updated: 2/6/2026, 10:45:58 AM
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x = coordinates[0][0];
        int y =coordinates[0][1];  
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];
        for(int i=1;i<coordinates.length;i++){
            int x2 = coordinates[i][0];
            int y2 = coordinates[i][1];
            if((x-x1)*(y2-y1)!=(y-y1)*(x2-x1)) 
            {
                return false;
            }
        //     x=x1;
        //     y=y1;

        }return true;
    }
}
//(x-x1)/(x2-x1) = (y-y1)(y2-y1)