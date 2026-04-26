class Solution {
public:
    vector<int> maxSubsequence(vector<int>& nums, int k) {
        vector<pair<int,int>> v;
        
        for (int i = 0; i < nums.size(); i++)
            v.push_back({nums[i], i});
        
        sort(v.begin(), v.end(), greater<>());
        
        vector<pair<int,int>> selected(v.begin(), v.begin() + k);
        
        sort(selected.begin(), selected.end(), [](auto &a, auto &b) {
            return a.second < b.second;
        });
        
        vector<int> result;
        for (auto &p : selected)
            result.push_back(p.first);
        
        return result;
    }
};