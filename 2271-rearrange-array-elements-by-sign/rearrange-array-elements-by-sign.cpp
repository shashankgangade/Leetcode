class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector<int> arr;
        vector<int>arr2;
        vector<int>arr3;
        for (int i = 0 ; i<nums.size();i++)
        {
              if(nums[i]<0)
              {
                arr.push_back(nums[i]);
              }
              else{
                arr2.push_back(nums[i]);
              }
        }
        for(int i = 0 ; i<arr.size(); i++)
        {
            arr3.push_back(arr2[i]);
            arr3.push_back(arr[i]);
        }
        return arr3;
    }
};