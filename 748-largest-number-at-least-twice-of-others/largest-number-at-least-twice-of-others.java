class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int maxindex = -1;
        for(int i = 0; i<nums.length ; i++){
            if(max<nums[i]){
                 max = nums[i];
                 maxindex = i;
            }
        }
        for(int i = 0 ; i<nums.length ; i++){
           if(maxindex!=i){
                if(nums[i]*2> max)
                {
                    return -1;
                }
           }
        }
        return maxindex;
    }
}