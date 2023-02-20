class Solution {
    public int alternateDigitSum(int n) {
        int t=n;
        int sum=0;
        int count=0;
       while(n>0){
           count+=1;
           n/=10;
       }
       
       while(t>0){
           int rem=t%10;
           if(count%2==0){
            rem=rem*-1;
        }
           count--;
           sum=sum+rem;
           t/=10;
        }
        return sum;
    }
}