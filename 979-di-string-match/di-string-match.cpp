class Solution {
public:
    vector<int> diStringMatch(string s) {
        int n = s.size();
        int low = 0, high = n;
        vector<int> res;

        for (char c : s) {
            if (c == 'I')
                res.push_back(low++);
            else
                res.push_back(high--);
        }

        res.push_back(low);
        return res;
    }
};