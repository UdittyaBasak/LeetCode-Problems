class Solution {
public:
    vector<int> relativeSortArray(vector<int>& arr1, vector<int>& arr2) {
        vector<int> count(1001, 0);
        
        for (int x : arr1)
            count[x]++;
        
        vector<int> result;
        
        for (int x : arr2) {
            while (count[x]-- > 0)
                result.push_back(x);
        }
        
        for (int i = 0; i < 1001; i++) {
            while (count[i]-- > 0)
                result.push_back(i);
        }
        
        return result;
    }
};