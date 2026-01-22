class Solution {
public:
    bool search(vector<int>& nums, int target) {
        sort(nums.begin() , nums.end());
        int left = 0 ; 
        int right = nums.size()-1;
        while (left <= right)
        {
            int mid =(left+right)/2;
            if(target == nums [mid])
            {
                return true;
            }
            else if(target<nums[mid]){
                      right = mid -1;

            }
            else{
                left = mid+1;
            }
        }
        return false;
    }
};