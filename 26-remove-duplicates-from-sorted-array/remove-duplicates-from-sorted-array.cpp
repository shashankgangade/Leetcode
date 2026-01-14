class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        vector<int> arr;
        int x =0;
        if(nums.size()!=0)
        {
             arr.push_back(nums[0]);
        }
        else
        {
            return 0;
        }
       for(int i = 0 ; i<nums.size(); i++)
       {      
                 if(nums[i]!=arr[x])
                 {
                       arr.push_back(nums[i]);
                       x++;
                 }
       }
       nums.erase(nums.begin() , nums.end());
       for(int i = 0 ; i < arr.size();i++)
       {
             nums.push_back(arr[i]);
       }
       return arr.size();
    }
};