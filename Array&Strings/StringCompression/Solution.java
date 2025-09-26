class Solution {
    public int compress(char[] chars) {
        int read=0;
        int write=0;
        while(read<chars.length){
            int count =0;
            char current=chars[read];
            while(read<chars.length && current==chars[read]){
                read++;
                count++;
            }
            chars[write]=current;
            write++;
            if(count>1){
                String countStr = String.valueOf(count);
                for(char digit:countStr.toCharArray()){
                    chars[write] = digit;
                    write++;
                }

                
            }



        }
        return write; 
        
    }
}