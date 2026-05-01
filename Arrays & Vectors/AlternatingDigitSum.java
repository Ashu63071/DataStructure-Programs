// https://leetcode.com/problems/alternating-digit-sum/
class Solution {
    public int alternateDigitSum(int n) {
        int nD = 0;
        int num = n;
        while(n>0){
            nD++;
            n = n/10;
        }
        int i=0 , sum=0;
        if(nD%2==0) i = 1;
        else i =2;
        while(num > 0){
            int d = num%10;
            if(i%2==0) sum += d;
            else sum -= d;
            num /= 10;
            i++;
        }
        return sum;
    }
}
