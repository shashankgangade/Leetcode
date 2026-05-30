class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = firstOccurrence(nums, target);
        ans[1] = lastOccurrence(nums, target);

        return ans;
    }

    private int firstOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                right = mid - 1; // go left
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }

    private int lastOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                left = mid + 1; // go right
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
}