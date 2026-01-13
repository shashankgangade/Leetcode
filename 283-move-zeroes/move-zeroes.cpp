class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int non_index = 0;   // taking a pointer 
        for (int i = 0 ; i<nums.size() ; i++ )
        {
              if (nums[i]!= 0)
              {
                int temp = nums[non_index];
                nums[non_index] = nums[i];
                nums[i] = temp;
                non_index++;
              }
        }
        
    }
};