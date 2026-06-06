class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 1;
        int blue = 2;
        int i = 0;
        int j = 0;
        int k = 0;
        for (int m = 0 ; m<nums.length ; m++)
        {
            if(nums[m]==0)
            {
                i++;
            }
            else if (nums[m]==1)
            {
                j++;
            }
            else
            {
                k++;
            }
        }
        // int q = i;
        // int r =i+j;
        int x = 0;
        while(i>0)
        {
            nums[x]= 0;
            x++;
            i--;
        }
        while(j>0)
        {
            nums[x] = 1;
            x++;
            j--;
        }
        while(k>0)
        {
            nums[x] = 2;
            x++;
            k--;
        }
        
    }
}