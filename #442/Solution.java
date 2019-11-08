/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 */

class Solution {
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> duplicates = new ArrayList<Integer>();
		Set<Integer> noDupes = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            if(noDupes.add(nums[i]) == false) {
            	duplicates.add(nums[i]);
            }
        }
        return duplicates;
	}
}
