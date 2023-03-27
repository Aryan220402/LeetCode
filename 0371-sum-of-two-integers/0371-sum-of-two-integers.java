class Solution {
    public static int getSum(int p, int q){
        int sum=p^q;
        int carry= p & q;
        int ans= (carry==0) ? sum : getSum(sum,carry<<1);
        return ans;
    }
}