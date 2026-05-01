// https://leetcode.com/problems/add-digits/
class Solution {
    public int addDigits(int num) {
        int s=num;
        while(s>9){
            int n = s;
            int sum = 0;
            while(n>0){
                sum += n%10;
                n /= 10;
            }
            s = sum;
        }
        return s;
    }
}
