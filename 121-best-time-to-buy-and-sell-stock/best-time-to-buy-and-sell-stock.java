class Solution {
    public int maxProfit(int[] prices) {
        int x = prices[0];
        int max = 0 ;
        for(int i = 1 ; i<prices.length ; i++)
        {
            if(x<prices[i])
            {    
                if((prices[i]-x)>max)
                {
                    max = prices[i]-x;
                }
            }
            else 
            {
                x = prices[i];
            }
            
        }
        return max;
    }
}