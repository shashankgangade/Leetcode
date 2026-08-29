class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();     // this creates a set where we can store unique elements of jewels 
        for( char ch : jewels.toCharArray()){
            set.add(ch);
        }

        int count = 0;
        for(char ch : stones.toCharArray()){
            if(set.contains(ch)){
                count++;
            }
        }
        return count;
    }
}