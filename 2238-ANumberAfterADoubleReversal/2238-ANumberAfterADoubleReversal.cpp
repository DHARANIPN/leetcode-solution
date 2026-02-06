// Last updated: 2/6/2026, 10:45:37 AM
class Solution {
public:
    bool isSameAfterReversals(int num) {
        if(num % 10 != 0 || num == 0){
            return true ;
        }
        else{
            return false;
        }
    }
};