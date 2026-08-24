class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        int var = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                var = Math.abs(i - start);

                if (var < min) {
                    min = var;

                }
            }
        }
        return min;
    }
}