// Last updated: 7/31/2026, 8:30:57 AM
1class StockSpanner {
2    Stack<int[]> st = new Stack<>();
3
4    public StockSpanner() {
5    }
6
7    public int next(int price) {
8        int count = 1;
9
10        while (!st.isEmpty() && st.peek()[0] <= price) {
11            count += st.peek()[1];
12            st.pop();
13        }
14
15        st.push(new int[]{price, count});
16
17        return count;
18    }
19}
20
21/**
22 * Your StockSpanner object will be instantiated and called as such:
23 * StockSpanner obj = new StockSpanner();
24 * int param_1 = obj.next(price);
25 */