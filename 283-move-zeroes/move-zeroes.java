class Solution {
    public void moveZeroes(int[] nums) {

        int j = 0;
        int temp = 0;

        for (int i = 0; i < nums.length; i++){
            if(nums[i] != 0){

                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                j++;

            }
            
        }

        // for (int i = 0; i < nums.length; i++){
        //      if(nums[i] != 0 && nums[j] != 0){
        //         i++;
        //         j++;
        //     } else if(nums[i] == 0 && nums[j] == 0){
        //         i++;
        //     } else if(nums[i] != 0 && nums[j] == 0){
        //         
        //     }
            
        // }
    }
}