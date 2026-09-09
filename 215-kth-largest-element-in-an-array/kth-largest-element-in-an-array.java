class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int kth = nums.length - k;

        return nums[kth];
    }
}