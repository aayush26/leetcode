/**
* https://leetcode.com/problems/throne-inheritance/
* Your runtime beats 18.72 % of java submissions.
* Your memory usage beats 12.96 % of java submissions.
*/
class ThroneInheritance {

    private Map<String, List<String>> m = new HashMap<>();
    private String head;
    
    private Set<String> s = new HashSet<>();
    
    public ThroneInheritance(String kingName) {
        m.put(kingName, new LinkedList<String>());
        head = kingName;
    }
    
    public void birth(String parentName, String childName) {
        List<String> l = m.get(parentName);
        l.add(childName);
        m.put(childName, new LinkedList<String>());
        m.put(parentName, l);
    }
    
    public void death(String name) {
        s.add(name);
    }
    
    public List<String> getInheritanceOrder() {
        List<String> res = new LinkedList<>();
        dfs(res, head);
        return res;
    }
    
    private void dfs(List<String> res, String name){
        if(!m.containsKey(name)) return;
        if(s.contains(name)){
            if(m.containsKey(name)){
                List<String> l = m.get(name);
                for(String s: l){
                    dfs(res, s);
                }
            }
        } else {
            res.add(name);
            if(m.containsKey(name)){
                List<String> l = m.get(name);
                for(String s: l){
                    dfs(res, s);
                }
            }
        }
    }
}

/**
 * Your ThroneInheritance object will be instantiated and called as such:
 * ThroneInheritance obj = new ThroneInheritance(kingName);
 * obj.birth(parentName,childName);
 * obj.death(name);
 * List<String> param_3 = obj.getInheritanceOrder();
 */
