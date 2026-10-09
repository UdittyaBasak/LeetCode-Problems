
class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int insertions = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open += 2;

                if (open % 2 != 0) {
                    insertions++;
                    open--;
                }
            } else {
                open--;

                if (open < 0) {
                    insertions++;
                    open = 1;
                }
            }
        }

        return insertions + open;
    }
}

