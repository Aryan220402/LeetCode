class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i : nums1){
            list.add(i);
        }
        for(int j : nums2){
            list.add(j);;
        }
        Collections.sort(list);
        int size=list.size();
        if((size%2)!=0){
            return  list.get(size/2);
        }
        else {
            double arr=list.get((size-1)/2)+ list.get((size+1)/2);
            return arr/2;
        }
    }
}