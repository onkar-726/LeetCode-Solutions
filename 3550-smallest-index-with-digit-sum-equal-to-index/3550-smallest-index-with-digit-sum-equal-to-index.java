class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int var = nums[i];
            while (var > 0) {
                sum += var % 10;
                var /= 10;
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}