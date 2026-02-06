// Last updated: 2/6/2026, 10:46:02 AM
class Solution {
    public int[] replaceElements(int[] arr) {
        int max =-1;
        int currentMax = -1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>currentMax) currentMax = arr[i];
            arr[i]=max;
            max=currentMax;
        } return arr;
    }
}