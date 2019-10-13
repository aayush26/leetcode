/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 * Runtime: 83 ms, faster than 5.24% of Java online submissions for Find All Duplicates in an Array.
 * Memory Usage: 52 MB, less than 33.33% of Java online submissions for Find All Duplicates in an Array.
 */
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> numbers = new TreeSet<>();
        List<Integer> dup = new ArrayList<>();
        for (int num: nums) {
            if(numbers.contains(num)){
                dup.add(num);
            }else{
                numbers.add(num);
            }
        }
        Collections.sort(dup);
        return dup;
    }
}