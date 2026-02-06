// Last updated: 2/6/2026, 10:45:05 AM
class Solution {
    public int findClosest(int x, int y, int z) {
        int person1 = Math.abs(x-z);
        int person2 = Math.abs(y-z);
        if(person1<person2) return 1;
        if(person1>person2) return 2;
        else return 0;
        
    }
}