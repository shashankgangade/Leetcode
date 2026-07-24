class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int num = 0 ;
        int tcount = 0;

        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]==target)
            {
                tcount++;
            }
            else if(nums[i]<target){
                num++;
            }
        }

        List<Integer> ans = new ArrayList();

        while(tcount>0)
        {
            ans.add(num);
            num++;
            tcount--;
        }
        return ans;
    }
}