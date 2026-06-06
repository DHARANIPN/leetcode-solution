// Last updated: 6/6/2026, 11:42:54 AM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int[][] arr = new int[text1.length()+1][text2.length()+1];
4        for(int i =1;i<=text1.length();i++){
5             for(int j =1;j<=text2.length();j++){
6                 if(text1.charAt(i-1) ==text2.charAt(j-1)){
7                    arr[i][j] = 1+ arr[i-1][j-1];
8                 } 
9                 else{
10                     arr[i][j] = Math.max( arr[i-1][j], arr[i][j-1]);
11                 }
12             }
13        }
14        return arr [text1.length()][text2.length()];
15        
16    }
17}