/**
 * https://leetcode.com/problems/battleships-in-a-board
 * Runtime: 1 ms, faster than 93.43% of Java online submissions for Battleships in a Board.
 * Memory Usage: 42.9 MB, less than 65.22% of Java online submissions for Battleships in a Board.
 */
class Solution {
    public int countBattleships(char[][] board) {
        int count=0;
        for (int i =0 ; i < board.length ; i++){
            for(int j=0; j< board[0].length; j++){
                if (board[i][j]=='X'){
                    if (i!=0 && board[i-1][j]=='X'){
                        continue;
                    }
                    if (j!=0 && board[i][j-1]=='X'){
                        continue;
                    }
                    count++;
                }
            }
        }
        return count;
    }
}
