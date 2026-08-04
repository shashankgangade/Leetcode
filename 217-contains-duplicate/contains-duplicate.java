class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> item = new HashSet<>();

        for (int num : nums) {
             item.add(num);
         }
        if(item.size() == nums.length)
        {
                 return false;
        }
        else {
            return true;
        }
    }
}