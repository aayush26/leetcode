import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        int x = -1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
    
            if(nums[i] >=0 )
                x = nums[i];
            else
                x = nums[i] + n +1 ;
            
            if(nums[x - 1] >= 0 )
                nums[x - 1] = nums[x - 1] - (n +1);
            else
                list.add(x);
            
        }
        
        return list;
    }
}