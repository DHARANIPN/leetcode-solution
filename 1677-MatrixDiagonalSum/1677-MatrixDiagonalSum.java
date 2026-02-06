// Last updated: 2/6/2026, 10:45:50 AM
class Solution {
    public int diagonalSum(int[][] mat) {
        int n =mat.length;
        int i=0,j=0;
        int sum =0;
        for(int k=1;k<=n;k++){  //primary
            sum+=mat[i][j];
            i++;
            j++;
        }
        i = 0;j=n-1;
        for(int k=1;k<=n;k++)   //secondary
        {
            if(i!=j) sum += mat[i][j];  //to skip center element that occupies both
            i++;
            j--;
        }  
        return sum;
   }
}