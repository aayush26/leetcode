/**
 * https://leetcode.com/problems/n-ary-tree-level-order-traversal/
 * runtime beats 77.82% of Java submissions
 * memory usage beats 67.50% of Java submissions
 
*/


class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ansList = new LinkedList();
        if(root==null)
            return ansList;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            List<Integer> currLevel = new ArrayList<>();
            int len = queue.size();
            for(int i=0;i<len;i++)
            {
                Node temp = queue.poll();
                currLevel.add(temp.val);
                for(Node child : temp.children)
                    queue.add(child);
            }
            ansList.add(currLevel);
        }
        return ansList;
    }
}
