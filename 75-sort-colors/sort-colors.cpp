class Solution {
public:
    void sortColors(vector<int>& nums) {
        int cred = 0;
        int cblue  = 0;
        int cwhite = 0;
        for (int i = 0 ; i< nums.size() ; i++){
            if(nums[i]==0){
                cred+=1;
            }
            else if (nums[i]==1){
                cwhite+=1;
            }
            else{
                cblue+=1;
            }
        }
         cwhite = cred+cwhite;
         cblue = cwhite+cblue;
        for(int i = 0 ; i<cred ; i++){
            nums[i]=0;
        }
        for (int i = cred; i<cwhite;i++){
            nums[i]=1;
        }
        for (int i = cwhite ; i<cblue ; i++){
            nums[i] = 2;
        }
        
        


   }
};