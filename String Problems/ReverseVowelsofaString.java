// https://leetcode.com/problems/reverse-vowels-of-a-string/
class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char ch[] = new char[n];
        int count = 0, k=0;
        for(int i = 0 ;i<n;i++){
            char c= s.charAt(i);
            if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ||
               c=='a' || c=='e' || c=='i' || c=='o' || c=='u'  ){
                ch[count++] = c;
               }
        }
        StringBuilder st = new StringBuilder();
        for(int i = 0 ;i<n;i++){
            if(ch[k] == s.charAt(i)){
                k++;
                st.append(ch[--count]);
            }
            else st.append(s.charAt(i));
        }
        return st.toString();

    }
}
