package reverseWords;

class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] arr=s.split("\\s+");
        int i=0;
        int j=arr.length-1;
        while(i<j){
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        StringBuilder sb=new StringBuilder();
        for(String k:arr){
            if(k==arr[arr.length-1]){
                sb.append(k);
                return sb.toString();
            }
            sb.append(k).append(" ");
        }

        return " ";
    }
}