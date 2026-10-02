class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        generate("", 0, 0, n, result);

        return result;
    }

    public void generate(String current, int open, int close, int n,
                         List<String> result) {

        if (current.length() == 2 * n) {

            if (isValid(current)) {
                result.add(current);
            }

            return;
        }

        generate(current + "(", open + 1, close, n, result);

        generate(current + ")", open, close + 1, n, result);
    }

    public boolean isValid(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }

            if (count < 0) {
                return false;
            }
        }

        return count == 0;
    }
}