class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int a = x;
        long int rev = 0;
        while (a!=0){
        long int digit = a%10;
        rev = rev*10+digit;
        a=a/10;
     }    
     
     if (x==rev)
     {
        return true;
     }
     else
     {
        return false;
     }
    }
};