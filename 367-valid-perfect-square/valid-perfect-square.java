class Solution {
    public boolean isPerfectSquare(int num) {
       long left = 0 ; 
       long right = num/2;
       if(num == 1)
       {
            return true;
       }
        if(num%10 == 2 ||num%10 == 3 ||num%10 == 7 ||num%10 == 8)
        { 
            return false;
        }
       while (left <= right)
       {
            long mid = left+(right-left)/2;
            if(mid*mid == num)
            {
                return true;
            }
            else if(mid*mid < num)
            {

                left = mid+1;
            }
            else {
                right = mid-1;
            }
       }
       return false;
    }
}