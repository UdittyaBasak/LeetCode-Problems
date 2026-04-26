class Solution {
public:
    int minCut(string s) {
        int n = s.size();
        vector<int> dp(n);
        vector<vector<bool>> isPal(n, vector<bool>(n, false));

        for (int i = 0; i < n; i++) {
            int minCuts = i;
            for (int j = 0; j <= i; j++) {
                if (s[i] == s[j] && (i - j <= 2 || isPal[j + 1][i - 1])) {
                    isPal[j][i] = true;
                    minCuts = (j == 0) ? 0 : min(minCuts, dp[j - 1] + 1);
                }
            }
            dp[i] = minCuts;
        }

        return dp[n - 1];
    }
};