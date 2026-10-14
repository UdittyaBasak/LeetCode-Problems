class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > num*9){
            return "";
        }

        StringBuilder str = new StringBuilder();

        for(int i = 0; i< num; i++){
            if(sum > 9){
                str.append(9);
                sum -= 9;
            } else {
                str.append(sum);
                sum = 0;
            }
        }

        return str.toString();
    }
}