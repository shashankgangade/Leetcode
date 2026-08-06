class Solution {
    public boolean isAnagram(String s, String t) {
        char[] x = s.toCharArray();
        char[] y = t.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        String a = new String(x);
        String b = new String(y);
        if(a.equals(b))
        {
             return true;
        }
        return false;
    }
}