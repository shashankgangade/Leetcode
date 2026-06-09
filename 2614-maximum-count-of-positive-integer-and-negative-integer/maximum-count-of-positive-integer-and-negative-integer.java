class Solution {
    public int maximumCount(int[] nums) {
        int lastnegindex = lastnegi(nums)+1;
        int firstposindex = nums.length-firstpos(nums);
        
        return Math.max(lastnegindex,firstposindex);
    }

        public int lastnegi(int nums[])
        {
            int left = 0;
            int right = nums.length-1;
            int ans = -1;
            while(left<=right){
                int mid = (left+right)/2;
                if(nums[mid] < 0)
                {
                    ans = mid;
                    left=mid+1;
                }
                else
                {
                    right = mid-1;
                }
            }
            return ans;

        }


         public int firstpos(int nums[])
        {
            int left = 0;
            int right = nums.length-1;
            int ans = nums.length;
            while(left<=right){
                int mid = (left+right)/2;
                if(nums[mid] > 0)
                {
                    ans = mid;
                    right=mid-1;
                }
                else
                {
                    left= mid+1;
                }
            }
            return ans;
        }
        
    
}