// Last updated: 6/21/2026, 1:30:29 PM
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<Integer> st = new Stack<>();
4        for(int i = 0; i < tokens.length; i++){
5            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
6                st.push(Integer.valueOf(tokens[i]));
7            }
8            else{
9                int b = st.pop();
10                int a = st.pop();
11
12                if(tokens[i].equals("+")){
13                    st.push(a+b);
14                }
15                else if(tokens[i].equals("-")){
16                    st.push(a-b);
17                }
18                else if(tokens[i].equals("*")){
19                    st.push(a*b);
20                }
21                else{
22                    st.push(a/b);
23                }
24            }
25        }
26        return st.peek();
27    }
28}