/**
 * https://leetcode.com/problems/word-search-ii/
 */
 
class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = buildTrie(words);
        List<String> res = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length;j++){
                dfs(board, root, i, j, res);
            }
        }
        return res;
    }
    
    public void dfs(char[][] b, TrieNode t, int i, int j, List<String> res){
        char c = b[i][j];
        if(c == '#' || t.next[c-'a'] == null) return;
        b[i][j] = '#';
        t = t.next[c-'a'];
        if(t.word != null){
            res.add(t.word);
            t.word = null;
        }
        if(i>0) dfs(b, t, i-1, j, res);
        if(j>0) dfs(b, t, i, j-1, res);
        if(i<b.length - 1) dfs(b, t, i+1, j, res);
        if(j<b[0].length - 1) dfs(b, t, i, j+1, res);
        b[i][j] = c;
    }
    
    public TrieNode buildTrie(String[] words){
        TrieNode root = new TrieNode();
        for(String w: words){
            TrieNode temp = root;
            for(char c: w.toCharArray()){
                int i = c - 'a';
                if(temp.next[i] == null){
                    temp.next[i] = new TrieNode();
                }
                temp = temp.next[i];
            }
            temp.word = w;
        }
        return root;
    }
    
    class TrieNode{
        TrieNode[] next = new TrieNode[26];
        String word;
    }
}
