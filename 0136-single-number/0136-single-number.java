class Solution {
    public int singleNumber(int[] nums) {
        int i=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for( i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
              int n=list.indexOf(nums[i]);
             list.remove(n);
            }else if(!list.contains(nums[i])){
                list.add(nums[i]);
            }                     
        }
         return  list.get(0);  
    }
}