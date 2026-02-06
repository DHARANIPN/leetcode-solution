// Last updated: 2/6/2026, 10:45:51 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int Drink = numBottles;
        int Empty = numBottles;
        while(Empty>=numExchange){
            int newBottles = Empty/numExchange;
            Empty = (Empty % numExchange)+ newBottles;
            Drink += newBottles;
        }
        return Drink;
    }
}