class Solution {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i<s.length() ; i++){
            if( s.charAt(i)!= ' '){
                 str.append(s.charAt(i));
            }
            else if(str.length()> 0){
                words.add(str.toString());
                str.setLength(0);
            }
        }
        if(str.length()>0){
            words.add(str.toString());
        }

        Collections.reverse(words);

        return String.join(" ", words);
    }
}