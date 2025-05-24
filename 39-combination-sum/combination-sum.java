class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        int n = candidates.length;

        Map<String, List<List<Integer>>> map = new HashMap<>();

        for (int i = 0; i <= target; i++) {
            map.put(0 + "|" + i, new ArrayList<>());
        }

        for (int i = 0; i <= n; i++) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>());
            map.put(i + "|" + 0, list);
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                List<List<Integer>> list = new ArrayList<>();
                if (candidates[i - 1] <= j) {
                    for (List<Integer> comb : map.get((i) + "|" + (j - candidates[i - 1]))) {
                        List<Integer> newComb = new ArrayList<>(comb);
                        newComb.add(candidates[i - 1]);
                        list.add(newComb);
                    }
                }
                list.addAll(map.get((i - 1) + "|" + j));
                map.put(i + "|" + j, list);
            }
        }

        return map.get(n + "|" + target);
    }
}