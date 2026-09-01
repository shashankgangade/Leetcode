class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        if(words == null || words.length == 0){
            return list;
        }
        list.add(words[0]);
        for(int i = 1 ; i<words.length ; i++){
            
              String curr = words[i];
              String next = list.get(list.size()-1);
              if(!isanagram(next , curr)){
                  list.add(curr);
                  
              }   
        }
         return list;
    }
       private boolean isanagram(String s1 , String s2){
           if(s1.length() != s2.length()){
               return false;
           }

           int freq[] = new int[26];
           for(int k = 0 ;k<s1.length() ; k++){
              freq[s1.charAt(k)-'a']++;
              freq[s2.charAt(k)-'a']--;
           }
           for(int count : freq){
              if(count != 0){
                  return false;
              }
           }
           return true;
       } 
    }