package moveZeroes;

class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        while(j<nums.length){
            if(i!=j && nums[i]==0 && nums[j]!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                 j++;
                i++;
                
            } else if(nums[i]==0 && nums[j]==0){
                j++;
            }
            else{
                 j++;
                i++;
            }
          
        }

        
    }
}
