class Solution {
    public int countDigits(int num) {
        int count=0;
        int t=num;
        while(num>0){
            int rem=num%10;
            if(t%rem==0){
                count+=1;
                
            }
             num=num/10;
        }
        return count;
    }
}