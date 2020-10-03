/**
* https://leetcode.com/problems/k-diff-pairs-in-an-array/
* runtime beats 26.46 % of java submissions
* memory usage beats 23.25 % of java submissions.
*/
class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            m.put(nums[i], i);
        }
        Set<Pair<Integer, Integer>> s = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            int p = nums[i] - k;
            if(p<=nums[i] && m.containsKey(p)) {
                if(m.get(p)!=i) {
                    s.add(new Pair<Integer, Integer>(Math.min(nums[i], p), Math.max(nums[i], p)));
                }
            }
            int q = nums[i] + k;
            if(q>=nums[i] && p!=q && m.containsKey(q)) {
                if(m.get(q)!=i) {
                    s.add(new Pair<Integer, Integer>(Math.min(nums[i], q), Math.max(nums[i], q)));
                }
            }
        }
        return s.size();
    }
}
