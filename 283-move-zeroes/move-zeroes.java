class Solution {
    public void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length];

        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                temp[count] = nums[i];
                count++;
            } 
        }
        // int len_diff = nums.length - (count +1);

        for(int i = 0; i< temp.length; i++){
            nums[i] = temp[i];
        }
        for(int i = count; i< nums.length; i++){
            nums[i] = 0;
        }


    }
}