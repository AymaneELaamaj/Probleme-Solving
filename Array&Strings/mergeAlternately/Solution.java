
class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1.length()==0 && word2.length()==0 ) {
            return null;
        }
       
        int i=0;
        
        StringBuilder result=new StringBuilder();
        while (i < word1.length() && i < word2.length()) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
            i++;
        }
        
        while (i < word1.length()) {
            result.append(word1.charAt(i));
            i++;
        }
        
        while (i < word2.length()) {
            result.append(word2.charAt(i));
            i++;
        }
        
        return result.toString();
        
    }
}