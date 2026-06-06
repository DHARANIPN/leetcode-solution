// Last updated: 6/6/2026, 3:41:51 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int[][] arr = new int[word1.length()+1][word2.length()+1];
4        for(int i = 0;i<word1.length()+1;i++){
5                arr[i][0] = i;
6        }
7        for(int j = 0;j<word2.length()+1;j++){
8            arr[0][j] = j;
9        }
10        for(int i = 1;i<word1.length()+1;i++){
11            for(int j =1;j<word2.length()+1;j++){
12             if(word1.charAt(i-1) == word2.charAt(j-1)){
13                   arr[i][j] = arr[i-1][j-1];
14             }
15             else{
16                  int  m = Math.min(arr[i-1][j-1],arr[i-1][j]);
17                  arr[i][j] = Math.min(arr[i][j-1],m)+1;
18             }
19            }
20        }
21        return arr[word1.length()][word2.length()];
22        
23    }
24}
25
26