class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0 ;
        int ans [] = new int [nums1.length + nums2.length];
        int k = 0;
        while (i< nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                ans[k] = nums1[i];
                k++;
                i++;
            }
            else
            {
                ans[k] = nums2[j];
                k++;
                j++;
            }
        }
        while (i< nums1.length)
        {
            ans[k] = nums1[i];
            k++;
            i++;
        }
        while (j< nums2.length)
        {
            ans[k] = nums2[j];
            k++;
            j++;
        }
        if(ans.length %2 == 0)
        {
            int m = (ans.length)/2;
            return (ans[m]+ans[(m-1)])/2.0;
        }
        else
        {
             int m = (ans.length)/2;
             return ans[m];
        }
    }
}