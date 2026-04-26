class Solution {
public:
    vector<vector<int>> matrixRankTransform(vector<vector<int>>& matrix) {
        int m = matrix.size(), n = matrix[0].size();
        vector<vector<int>> result(m, vector<int>(n, 0));

        map<int, vector<pair<int,int>>> mp;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mp[matrix[i][j]].push_back({i, j});

        vector<int> rank(m + n, 0);

        for (auto &it : mp) {
            vector<int> parent(m + n);
            for (int i = 0; i < m + n; i++) parent[i] = i;

            function<int(int)> find = [&](int x) {
                return parent[x] == x ? x : parent[x] = find(parent[x]);
            };

            auto unite = [&](int a, int b) {
                parent[find(a)] = find(b);
            };

            for (auto &p : it.second) {
                unite(p.first, p.second + m);
            }

            unordered_map<int, int> groupMax;
            for (auto &p : it.second) {
                int root = find(p.first);
                groupMax[root] = max(groupMax[root], max(rank[p.first], rank[p.second + m]));
            }

            for (auto &p : it.second) {
                int root = find(p.first);
                int r = groupMax[root] + 1;
                result[p.first][p.second] = r;
                rank[p.first] = r;
                rank[p.second + m] = r;
            }
        }

        return result;
    }
};