class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<n;i++){
            if(prices[i]<buy)
                buy=prices[i];
            maxProfit=Math.max(prices[i]-buy,maxProfit);
        }
        return maxProfit;
    }
}