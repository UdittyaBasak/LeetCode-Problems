class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int insertion = 0;

        for (int i = 0; i<s.length(); i++){

            if(s.charAt(i) == '('){
                open++;
            } else {
            //checks if the next element is ')' or else adds 1 to insertion
                if(i+1 < s.length() && s.charAt(i + 1) == ')'){
                    i++;
                } else {
                    insertion++;
                }

            //decreases open or else adds one for the '(' as incomplete
                if(open > 0){
                    open--;
                } else {
                    insertion++;
                }
            }
        }

        //adds double of th open bracket numbers for the left overs example: '(())) (('
        insertion = insertion + open*2;

        return insertion;
    }
}