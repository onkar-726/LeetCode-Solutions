class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        int res = k;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        while (set.contains(res)) {
            res += k;
        }
        return res;
    }
}