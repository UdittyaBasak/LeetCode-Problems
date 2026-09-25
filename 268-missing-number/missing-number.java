class Solution {
    public int missingNumber(int[] nums) {

        for (int i = 1; i<= nums.length; i++){
            boolean found = false;

            for (int j = 0; j<nums.length ; j++) {
                if(nums[j] == i){
                    found = true;
                    break;
                }
            }
            if(!found){
                return i;
            }

        }

        return 0;
    }
}