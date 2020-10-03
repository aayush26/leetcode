/**
* https://leetcode.com/problems/3sum/
* Your runtime beats 33.97 % of java submissions.
* Your memory usage beats 24.76 % of java submissions.
*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ll = new LinkedList<>();
        if(nums.length<3) return ll;
        Arrays.sort(nums);
        Set<Pair<Integer, Integer>> s = new HashSet<>();
        for(int i=0; i<nums.length-2; i++){
            int j=i+1, k=nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    int min = Math.min(nums[i], Math.min(nums[j], nums[k]));
                    int max = Math.max(nums[i], Math.max(nums[j], nums[k]));
                    if(s.add(new Pair<Integer, Integer>(min, max))){
                        List<Integer> l = new LinkedList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        ll.add(l);
                    }
                    j++;
                    k--;
                } else if(sum<0) j++;
                else k--;
            }
        }
        return ll;
    }
}
