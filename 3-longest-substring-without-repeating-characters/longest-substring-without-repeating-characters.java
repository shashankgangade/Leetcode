class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        Arrays.fill(hash , -1);
        int left = 0 ;
        int right = 0;
        int maxlen = 0;
        while(right<s.length()){
            if(hash[s.charAt(right)]!=-1){
                if(hash[s.charAt(right)]>=left){
                       left = hash[s.charAt(right)]+1;
                }
            }
            int len = right-left+1;
            maxlen = Math.max(len , maxlen);
            hash[s.charAt(right)] = right;
            right++;
        }
        return maxlen;
    }
}