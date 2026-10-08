class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder answer = new StringBuilder();
        int depth = 0;

        for(char ch : s.toCharArray()){

            if(ch == '('){
                 
                if(depth!=0){
                    answer.append('(');

                }
                
                depth++;

            }

            else if(ch == ')'){

                depth--;

                if(depth!=0){
                    answer.append(')');

                }

            }

        }

        return answer.toString();
    }
}