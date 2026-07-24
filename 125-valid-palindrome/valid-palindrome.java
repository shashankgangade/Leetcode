class Solution {
    public boolean isPalindrome(String s) {
         StringBuilder result = new StringBuilder() ;
         for(int i = 0 ; i<=s.length()-1 ; i++){
            char ch = s.charAt(i);
            if( Character.isLetterOrDigit(ch) )
            {
                result.append(ch);
            }
            else
            {
                continue;
            }
         }
         String finalresult = result.toString();
         int i = 0;
         int j = finalresult.length()-1;
         
         while(i<=j)
         {
            if(Character.toLowerCase(finalresult.charAt(i))==Character.toLowerCase(finalresult.charAt(j)))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
         }
         return true;
    }
}