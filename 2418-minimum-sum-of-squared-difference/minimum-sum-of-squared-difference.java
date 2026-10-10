class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

        int n = nums1.length;
        int[] diff = new int[n];

        long sum = 0;
        int maxDiff = 0;
        long k = (long) k1 + k2;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            sum += diff[i];
            maxDiff = Math.max(maxDiff, diff[i]);
        }

        if (sum <= k) {
            return 0;
        }

        int left = 0;
        int right = maxDiff;

        while (left < right) {
            int mid = left + (right - left) / 2;
            long operations = 0;

            for (int d : diff) {
                operations += Math.max(d - mid, 0);
            }

            if (operations <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        for (int i = 0; i < n; i++) {
            k -= Math.max(diff[i] - left, 0);
            diff[i] = Math.min(diff[i], left);
        }

        for (int i = 0; i < n && k > 0; i++) {
            if (diff[i] == left) {
                diff[i]--;
                k--;
            }
        }

        long answer = 0;

        for (int d : diff) {
            answer += (long) d * d;
        }

        return answer;
    }
}