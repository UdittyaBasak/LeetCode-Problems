class Solution {
public:
    vector<int> parent;

    int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    void unite(int a, int b) {
        parent[find(a)] = find(b);
    }

    bool gcdSort(vector<int>& nums) {
        int maxVal = *max_element(nums.begin(), nums.end());
        parent.resize(maxVal + 1);
        for (int i = 0; i <= maxVal; i++)
            parent[i] = i;

        vector<int> spf(maxVal + 1);
        for (int i = 2; i <= maxVal; i++) {
            if (spf[i] == 0) {
                for (int j = i; j <= maxVal; j += i) {
                    if (spf[j] == 0)
                        spf[j] = i;
                }
            }
        }

        for (int x : nums) {
            int num = x;
            while (num > 1) {
                int factor = spf[num];
                unite(x, factor);
                while (num % factor == 0)
                    num /= factor;
            }
        }

        vector<int> sorted = nums;
        sort(sorted.begin(), sorted.end());

        for (int i = 0; i < nums.size(); i++) {
            if (find(nums[i]) != find(sorted[i]))
                return false;
        }
        return true;
    }
};