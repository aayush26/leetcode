class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        DFS(root, 1, result);
        return result;
    }
    
    private void DFS(Node root, int level, List<List<Integer>> result) {
        if(root == null) return;
        if(result.size() < level) {
            result.add(new ArrayList<>());
        }
        result.get(level - 1).add(root.val);
        for(Node child : root.children) {
            DFS(child, level + 1, result);
        }
    }
} 
