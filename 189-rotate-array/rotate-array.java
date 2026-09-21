class Solution {
    public void rotate(int[] nums, int k) {

        // int temp[] = new int[k+1];

        // for (int i = 0; i <= k; i++) {
        //     temp[i] = nums[i];
            
        // }
                


        // for (int i = k + 1; i < nums.length; i++) {

        //     nums[i-(k+1)] = nums[i];

        // }

        // int j = 0;
        // // for (int i = k+1; i < nums.length ; i++) {
        // //     nums[nums.length-k] = temp[i - (k+1)];
        // // }
            
        // for (int i = k; i < nums.length; i++ ){
        //     nums[i] = temp[j];
        //     j++;
        // }   

        k = k % nums.length; //basically you are make the k smaller 

        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    public void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start ++;
            end --;
        }
    }
}