class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int arr[] = new int[seq.length()];

        int depth = 1; //depth for every parentheses "(" or ")"

        for( int i = 0; i< seq.length(); i++){
            if(seq.charAt(i) == '('){
                depth++;
                arr[i] = depth % 2;
            } else if(seq.charAt(i) == ')') {
                arr[i] = depth % 2;
                depth--;
            }
        }

        return arr;
    }
}