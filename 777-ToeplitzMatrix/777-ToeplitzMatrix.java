// Last updated: 2/6/2026, 10:46:07 AM
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix.length==1) return true;
        for(int i=0;i<matrix.length-1;i++){
            for(int j = 0;j<matrix[i].length-1;j++){
                       if(matrix[i][j]!=matrix[i+1][j+1]) return false;
            }
        }    return true;
    }
}