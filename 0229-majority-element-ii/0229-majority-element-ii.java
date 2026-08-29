class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int max = n / 3;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> result = new ArrayList<>();

        for (int j = 0; j < n; j++) {
            int current = nums[j];
            if (map.containsKey(current)) {
                int count = map.get(current);

                if (count > max) {
                    result.add(current);
                }
                map.remove(current);
            }
        }
        return result;
    }
}
