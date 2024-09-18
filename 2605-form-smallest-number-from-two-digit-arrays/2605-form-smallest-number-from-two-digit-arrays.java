class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> hash=new HashSet<Integer>();
        for(int i: nums1){
            hash.add(i);
        }
        for(int i: nums2){
            if(hash.contains(i)){
                return i;
            }
        }
        if(nums1[0]<nums2[0]){
           return nums1[0]*10+nums2[0];
        }
        return nums2[0]*10+nums1[0];
        
    }
}