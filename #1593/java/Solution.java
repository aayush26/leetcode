/**
* https://leetcode.com/problems/split-a-string-into-the-max-number-of-unique-substrings/
* Your runtime beats 20.99 % of java submissions.
* Your memory usage beats 21.75 % of java submissions.
*/
class Solution {
    int max = 0;
    public int maxUniqueSplit(String s) {
        backtrack(s, 0, new HashSet<String>());
        return max;
    }
    
    private void backtrack(String s, int i, HashSet hs){
        if(i>=s.length()) {
            max = Math.max(hs.size(), max);
        }
        for(int k=i; k<s.length(); k++){
            String temp = s.substring(i, k+1);
            if(hs.contains(temp)){
                continue;
            } else {
                hs.add(temp);
                backtrack(s, k+1, hs);
                hs.remove(temp);
            }
        }
    }
}
