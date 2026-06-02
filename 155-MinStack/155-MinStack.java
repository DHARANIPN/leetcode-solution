// Last updated: 6/2/2026, 10:50:05 AM
1class MinStack {
2         Stack<Integer> Stack1;
3         Stack<Integer> Stack2;
4    public MinStack() {
5       Stack1 = new Stack<>();
6       Stack2 = new Stack<>();
7    }
8
9    public void push(int val){
10        Stack1.push(val);
11        if(Stack2.isEmpty() || val<=Stack2.peek()) Stack2.push(val);
12    }
13    
14    public void pop() {
15        if(Stack1.peek().equals(Stack2.peek())) Stack2.pop();
16        Stack1.pop();
17    }
18    
19    public int top() {
20        return Stack1.isEmpty()?-1:Stack1.peek();
21    }
22    
23    public int getMin() {
24        return Stack2.isEmpty()?-1:Stack2.peek();
25    }
26}
27
28
29/**
30 * Your MinStack object will be instantiated and called as such:
31 * MinStack obj = new MinStack();
32 * obj.push(val);
33 * obj.pop();
34 * int param_3 = obj.top();
35 * int param_4 = obj.getMin();
36 */