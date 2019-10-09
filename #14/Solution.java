/**
 * https://leetcode.com/problems/longest-common-prefix/
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        String l = strs[0];
        int y = 0;
        for(int i=0; i<l.length();i++){
            char c = l.charAt(i);
            int x = 0;
            for(int j=1; j<strs.length; j++){
                if(i==strs[j].length() || strs[j].charAt(i) != c){
                    return l.substring(0, i);
                }
            }
        }
        return l;
    }
}
