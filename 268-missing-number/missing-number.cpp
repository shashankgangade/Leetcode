class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int l = nums.size();
        sort(nums.begin(),nums.end());
        int i = 0;
        while(i<l)
        {
            if(nums[i]!=i)
            {
                return i;
            }
            i++;
        }

        return i;
    }   
};