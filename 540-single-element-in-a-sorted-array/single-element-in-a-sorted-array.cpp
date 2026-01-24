class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
        int left = 0;
        int right = nums.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            // handle boundaries safely
            if (mid == 0) {
                return nums[0];
            }
            if (mid == nums.size() - 1) {
                return nums[mid];
            }

            // if mid is the single element
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            // ensure mid points to first element of a pair
            if (nums[mid] == nums[mid - 1]) {
                mid--;
            }

            // binary search decision
            if (mid % 2 == 0) {
                left = mid + 2;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }
};
