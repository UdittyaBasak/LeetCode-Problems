class Solution {
public:
    int splitArray(vector<int>& nums, int k) {
        long long left = *max_element(nums.begin(), nums.end());
        long long right = accumulate(nums.begin(), nums.end(), 0LL);

        while (left < right) {
            long long mid = left + (right - left) / 2;

            int count = 1;
            long long curr = 0;

            for (int x : nums) {
                if (curr + x > mid) {
                    count++;
                    curr = x;
                } else {
                    curr += x;
                }
            }

            if (count > k)
                left = mid + 1;
            else
                right = mid;
        }

        return left;
    }
};