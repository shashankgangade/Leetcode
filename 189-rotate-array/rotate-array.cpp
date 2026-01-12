class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n = nums.size();
        if (n==0)
        {
            return;
        }
        k = k%n;
        if(k==0)
        {
            return;
        }
       reverse(nums.begin() ,nums.end()); //reversing all the elements
       reverse(nums.begin() , nums.begin()+k);   //reversing first 3 elements
       reverse(nums.begin()+k,nums.end());   // reversing remaining last elements



    }
};