class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // HashSet<Character> set = new HashSet<>();     // this creates a set where we can store unique elements of jewels 
        // for( char ch : jewels.toCharArray()){
        //     set.add(ch);
        // }

        // int count = 0;
        // for(char ch : stones.toCharArray()){
        //     if(set.contains(ch)){
        //         count++;
        //     }
        // }
        // return count;


        boolean isjewel[] = new boolean[128];
        for(char ch : jewels.toCharArray()){
            isjewel[ch] = true;
        }

        int count = 0;
        for(char ch : stones.toCharArray()){
            if(isjewel[ch]){
                 count ++;
            }
        }
        return count;
    }
}