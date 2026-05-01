// https://leetcode.com/problems/baseball-game/
class Solution {
    public int calPoints(String[] op) {
        int n = op.length;
        int i =0;
        Stack<Integer> st = new Stack<Integer>();
        while(i < n){
            if(op[i].equals("+")){
                int lastScore = st.pop();
                int sum = st.peek() + lastScore;
                st.push(lastScore);
                st.push(sum);
            }
            else if(op[i].equals("D")){
                int peek = st.peek();
                int doubleScore = 2*peek;
                st.push(doubleScore);
            }
            else if(op[i].equals("C")){
                st.pop();
            }
            else{
                int x = Integer.parseInt(op[i]); 
                st.push(x);
            }
            i++;
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}
