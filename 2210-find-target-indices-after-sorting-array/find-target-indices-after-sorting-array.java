class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int a = 0;
        int b = 0;
        for(int i = 0 ; i<nums.length ; i++)
        {
            if(nums[i] == target){
                a++;
            }
            else if (nums[i]<target){
                b++;
            }
        }
        List<Integer> arr = new ArrayList();
        while (a>0){
            arr.add(b);
            b++;
            a--;
        }

        return arr;
    }
}