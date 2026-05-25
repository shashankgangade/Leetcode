class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int n = nums.length;
        int j = n-1;
        int ans [] = new int[n];
        int k = n-1;
        while(i<=j)
        {
            if(Math.abs(nums[i])>Math.abs(nums[j]))
            {
                ans[k]= nums[i]*nums[i];
                k--;
                i++;
            }
            else 
            {
                ans[k] = nums[j]*nums[j];
                k--;
                j--;
            }
        }
        return ans;
    }
}