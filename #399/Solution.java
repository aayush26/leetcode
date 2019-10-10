class Solution {
    Map<String, HashMap<String, Double>> storage = new HashMap<>();

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        for (int i = 0; i < equations.size(); ++i) {
            String x = equations.get(i).get(0);
            String y = equations.get(i).get(1);
            double k = values[i];

            HashMap<String, Double> map = storage.get(x);
            if (map == null) {
                storage.put(x, map = new HashMap<String, Double>());
            }
            map.put(y, k);

            map = storage.get(y);
            if (map == null) {
                storage.put(y, map = new HashMap<String, Double>());
            }
            map.put(x, 1 / k);
        }

        double[] ans = new double[queries.size()];

        for (int i = 0; i < queries.size(); ++i) {
            String x = queries.get(i).get(0);
            String y = queries.get(i).get(1);

            if (!storage.containsKey(x) || !storage.containsKey(y)) {
                ans[i] = -1.0;
            } else {
                ans[i] = divide(x, y, new HashSet<String>());
            }
        }

        return ans;
    }

    private double divide(String x, String y, Set<String> visited) {
        if (x.equals(y))
            return 1.0;

        visited.add(x);
        if (!storage.containsKey(x))
            return -1.0;

        for (String n : storage.get(x).keySet()) {
            if (visited.contains(n))
                continue;
            visited.add(n);
            double d = divide(n, y, visited);
            if (d > 0)
                return d * storage.get(x).get(n);
        }

        return -1.0;
    }
}

