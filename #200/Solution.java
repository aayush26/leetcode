/**
 * https://leetcode.com/problems/number-of-islands/
 */
 
class Solution {
    char[][] g;
    public int numIslands(char[][] grid) {
        g = grid;
        int islands = 0;
        for(int i=0; i<g.length; i++){
            for(int j=0; j<g[i].length; j++){
                islands += count(i, j); 
            }
        }
        return islands;
    }
    
    private int count(int i, int j){
        if(i<0 || j<0 || i==g.length || j==g[i].length || g[i][j] == '0') return 0;
        g[i][j] = '0';
        count(i+1, j);
        count(i-1, j);
        count(i, j+1);
        count(i, j-1);
        return 1;
    }
}
