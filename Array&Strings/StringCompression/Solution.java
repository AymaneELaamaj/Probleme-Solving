    class Solution {
        public int compress(char[] chars) {
            Map<Character,Integer> newarr=new HashMap<>();
            int j=0;
            for(int i=0;i<chars.length;i++){
                newarr.put(chars[i],newarr.getorDefault(chars[i],0)+1);
            }
            for(Character key : newarr.keySet()) {
            Integer value = newarr.get(key);
            j++;
            }
            return j;
            
        }
    }