class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int[] nums2 = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (j == i) {
                nums2[i] = nums1[i];
            } else {
                nums2[i] = nums1[i] - nums1[j];
            }
            j++;
        }
        for (int num : nums2) {
            if (num % 2 == 0 || num % 2 != 0) {
                return true;
            }

        }
        return false;

    }
}