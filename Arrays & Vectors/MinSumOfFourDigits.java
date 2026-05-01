
// Problem 2 : minimum sum of four digit number after splitting digits
// https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/

class Solution {
    public int minimumSum(int num) {
        int a[] = new int[4];
        int i = 0;
        while(num>0){
            a[i++] = num%10;
            num = num/10;
        }
        Arrays.sort(a);
        int new1 = a[0] *10+ a[2];
        int new2 = a[1] *10 +a[3];
        return new1+new2;
    }
}
