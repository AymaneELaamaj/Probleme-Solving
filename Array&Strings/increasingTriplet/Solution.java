package increasingTriplet;

class Solution {
    public boolean increasingTriplet(int[] nums) {
       int first=Integer.MAX_VALUE;
       int seconde=Integer.MAX_VALUE;
       for(int num:nums){
        if(num<=first){
            first=num;
        }
        else if(num<=seconde){
            seconde=num;
        }
        else{
            return true;
        }
       }
       return false;
}}
