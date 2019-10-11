/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
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