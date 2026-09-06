class Solution {
    public int search(int[] nums, int target) {
        
        int len = nums.length;

        int left = 0;
        int right = len - 1;

        while(left <= right){

            int mid = left + (right - left) / 2;

            if (nums[mid] == target){
                return mid;
            }

            if (nums[left]<=nums[mid]){ //left
                if (target >= nums[left] && target < nums[mid]){
                    right = mid -1;
                } else {
                    left = mid +1;
                }
            } else {
                if (target <=nums [right] && target > nums[mid]){ //right
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;

    }
}