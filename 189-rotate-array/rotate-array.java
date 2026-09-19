class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        int temp[] = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[nums.length - k + i];
        }

        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}