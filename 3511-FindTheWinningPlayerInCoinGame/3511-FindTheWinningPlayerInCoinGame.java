// Last updated: 2/6/2026, 10:45:07 AM
class Solution {
    public String winningPlayer(int x, int y) {
        int turn = 1;
        while(x>0 && y>3) {
            x-=1;
            y-=4;
            turn++;
        }
        if(turn % 2 == 0) return "Alice";
        else return "Bob";
    }
}