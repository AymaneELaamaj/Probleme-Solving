import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<0;i++){
            int needed=target-nums[i];
            if (hashMap.containsKey(needed)){
                return new int[]{hashMap.get(needed), i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[]{};


    }
}