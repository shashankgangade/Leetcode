class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int left = 0;
        int right = nums.size() - 1;

        if(nums.size() == 0) return {-1,-1};

        if(nums.size() == 1 && target == nums[0]) {
            return {0,0};
        }

        if(nums.size() == 2 && target == nums[0]) {
            if(nums[0] == nums[1]) return {0,1};
            else return {0,0};
        }

        if(nums.size() == 2 && target == nums[1]) {
            return {1,1};
        }

        while(left <= right) {
            int mid = (left + right) / 2;

            if(nums[mid] == target) {

                int i = mid;
                int j = mid;

                // expand left
                while(i-1 >= 0 && nums[i-1] == target) {
                    i--;
                }

                // expand right
                while(j+1 < nums.size() && nums[j+1] == target) {
                    j++;
                }

                return {i, j};
            }
            else if(target < nums[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return {-1,-1};
    }
};
