// Last updated: 6/21/2026, 12:16:04 PM
1class Solution {
2    public boolean isValid(String s) {
3        if (s.length() <= 1) return false;
4        Stack<Character> st = new Stack<>();
5
6        for(int i = 0 ; i < s.length(); i++){
7            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
8                st.push(s.charAt(i));
9            }
10            else{
11                if(!st.isEmpty() && s.charAt(i) == ')' && st.peek() == '(' || !st.isEmpty() && s.charAt(i) == '}' && st.peek() == '{' || !st.isEmpty() && s.charAt(i) == ']' && st.peek() == '[' ){
12                    st.pop();
13                }
14                else{
15                    return false;
16                }
17            }
18        }
19        if (st.isEmpty() ){
20            return true;
21        }
22        else{
23            return false;
24        }
25    }
26}