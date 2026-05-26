class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j =  height.length-1;
        int max = 0;
        int groundsize = height.length-1;
        while(i<j)
        {
            if(height[i]<height[j])
            {
                if(max<height[i]*groundsize)
                {
                      max = height[i]*groundsize;
                      i++;
                      groundsize--;
                }
                else 
                {
                    i++;
                    groundsize--;
                }
            }
            else 
            {
                if(max<groundsize*height[j])
                {
                    max = height[j]*groundsize;
                    j--;
                    groundsize--;
                }
                else {
                    j--;
                    groundsize--;
                }
            }
        }
        return max;
    }
}