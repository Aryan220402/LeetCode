class Solution {
    public char findTheDifference(String s, String t) {
        char st=0;
        for(int i=0;i<s.length();i++){
            st^=s.charAt(i);
        }
        
        for(int i=0;i<t.length();i++){
            st^=t.charAt(i);
        }
        return st;
    }
}