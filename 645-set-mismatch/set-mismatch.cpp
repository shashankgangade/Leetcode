class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        set <int> arr;
        for(int i = 0 ; i< nums.size() ; i++)
        {
            arr.insert(nums[i]);
        }

        sort(nums.begin(),nums.end());
        int dup = -1 ;
        int miss = -1;
        for(int i = 1 ; i< nums.size() ; i++)
        {
                 if(nums[i]==nums[i-1])
                 {
                    dup = nums[i];
                    break;
                 }
        }
        
        for(int i = 1 ; i<=nums.size() ; i++)
        {
            if(arr.find(i)==arr.end())
            {
                miss = i;
                break;
            }
        }

        return {dup , miss};

    }
};