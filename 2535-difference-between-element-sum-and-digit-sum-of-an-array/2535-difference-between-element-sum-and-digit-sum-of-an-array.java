class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sum1=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
         int rev=0;
            int t=nums[i];
        while(t>0){
            int rem=t%10;
            sum1=sum1+rem;
            t/=10;
        }   
        }
            return Math.abs(sum-sum1);
    }

}