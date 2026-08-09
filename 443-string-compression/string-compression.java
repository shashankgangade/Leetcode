class Solution {
    public int compress(char[] chars) {
        StringBuilder result = new StringBuilder("");
        int count = 1;

        result.append(chars[0]);
        for(int i = 1 ; i<chars.length ; i++){
            if(chars[i-1]!=chars[i]){
               if(count>1){
                   result.append(count+"");
               }
               result.append(chars[i]);
               count = 1;
            }
            else{
                   count++;
               }
        }

        if(count>1){
            result.append(count+"");
        }
        for(int i = 0 ; i<result.length() ; i++){
            char ch = result.charAt(i);
            chars[i] = ch;
        }
        return result.length();
    }
}
