class Solution {
    public long maxAlternatingSum(int[] nums) {

        for(int i = 0; i<nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }

        Arrays.sort(nums);

        int left = 0;
        int right = nums.length -1;
        long sum = 0;

        while(left<=right){
            long largest = nums[right];
            sum += largest;
            right--;

            if(left<=right){
                long smallest = nums[left];
                sum -= smallest;
                left++;
            }
        } 



        // int left = 0;
        // int right = nums.length-1;
        // long sum = 0;

        // while(left<=right){
        //     long largest = nums[right];
        //     sum += largest * largest;
        //     right--;

        //     if(left<=right){
        //         long smallest = nums[left];
        //         sum -= smallest * smallest;
        //         left++;
        //     }
        // } 

        return sum;
    }
}