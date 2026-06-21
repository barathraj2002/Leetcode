// Last updated: 6/21/2026, 12:52:54 PM
1class MinStack {
2    Stack<Integer> st;
3    Stack<Integer> minst;
4
5    public MinStack() {
6        st = new Stack<>();
7        minst = new Stack<>();
8    }
9    
10    public void push(int value) {
11        if(minst.isEmpty()){
12            minst.push(value);
13        }
14        else{
15            if(value <= minst.peek()){
16                minst.push(value);
17            }
18        }
19        st.push(value);
20    }
21    
22    public void pop() {
23        if(minst.peek().intValue() == st.peek().intValue()){
24            minst.pop();
25        }
26        st.pop();
27    }
28    
29    public int top() {
30        return st.peek();
31    }
32    
33    public int getMin() {
34        return minst.peek();
35    }
36}
37
38/**
39 * Your MinStack object will be instantiated and called as such:
40 * MinStack obj = new MinStack();
41 * obj.push(value);
42 * obj.pop();
43 * int param_3 = obj.top();
44 * int param_4 = obj.getMin();
45 */