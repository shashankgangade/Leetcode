class Solution {
public:
    double myPow(double x, long long n) {
        long long N = n;
        if(N<0)
        {
            x = 1/x;
            N = -N; 
        }
        return solve(x , N);
       
    }

    double solve(double x , long long N)
    {
         if(N == 0)
        {
            return 1;
        }
        else if (N%2 == 0)
        {
            return myPow(x*x , N/2);
        }
        else
        {
            return  x * myPow(x*x , (N-1)/2);
        }
    }
};