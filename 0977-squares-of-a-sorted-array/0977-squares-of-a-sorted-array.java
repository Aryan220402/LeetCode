class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0, j = nums.length - 1;
        for (int p = nums.length - 1; p >= 0; p--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                ans[p] = nums[i] * nums[i];
                i++;
            } else {
                ans[p] = nums[j] * nums[j];
                j--;
            }
        }
        return ans;
    }
}