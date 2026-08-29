class Solution {
    public char repeatedCharacter(String s) {
        HashSet <Character> map = new HashSet<>();
        for( char ch : s.toCharArray()){
            if(map.contains(ch))
            {
                return ch;
            }
            map.add(ch);
        }

        return ' ';
    }
}