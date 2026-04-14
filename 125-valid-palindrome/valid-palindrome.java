class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder newstr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--){
            newstr.append(str.charAt(i));
        }
        return str.equals(newstr.toString());
    }
}