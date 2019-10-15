/**
 * https://leetcode.com/problems/n-ary-tree-level-order-traversal/
 * runtime beats 100.00% of Java submissions
 * memory usage beats 17.50% of Java submissions
 
*/


class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        return levelOrder(root, 0, new ArrayList<>());
    }
    
    private List<List<Integer>> levelOrder(Node node, int level, List<List<Integer>> order){
        if (node == null){
            return order;
        }
        List<Integer> list = order.size() > level ?  order.get(level) : new ArrayList<>();
        list.add(node.val);
        if (order.size() <= level){
            order.add(list);
        }
        for (Node n : node.children){
            levelOrder(n, level + 1, order);
        }
        return order;
    }
}

