/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 */

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++)
            if(nums[i] == nums[i+1] && !temp.contains(nums[i]))
                temp.add(i);
        return temp;
    }
}