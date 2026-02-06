// Last updated: 2/6/2026, 10:46:33 AM
class Solution {
        public static int SumOfSquares(int n){
            int sum = 0;
            while(n!=0){
                int d =n%10;
                sum+=(d*d);
                n/=10;
            }return sum;
        }
         public boolean isHappy(int n) {
            int slow = n;
            int fast =n;
            do{
                slow = SumOfSquares(slow);
                fast = SumOfSquares(SumOfSquares(fast));
            }while(slow!=fast);
            return slow==1?true:false;
    }
}