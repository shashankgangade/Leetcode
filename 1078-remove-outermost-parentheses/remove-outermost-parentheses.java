class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder  str = new StringBuilder();
        int level_counter = 0;
        int count = 0;
        int num = 0;
        for(int i = 0 ; i< s.length() ;i++ ){
              if(s.charAt(i)== '(' && level_counter == 0){
                     level_counter++;
              }
              else if(s.charAt(i)== '(' && level_counter>0){
                    count++;
                    str.append(s.charAt(i));
                    num++;
              }
              else if(s.charAt(i) == ')' && count>0){
                    count--;
                    str.append(s.charAt(i));
                    num++;
              }
              else if(s.charAt(i) == ')' && count == 0){
                    level_counter = 0;
              }
        }
        return str.toString();
    }
}