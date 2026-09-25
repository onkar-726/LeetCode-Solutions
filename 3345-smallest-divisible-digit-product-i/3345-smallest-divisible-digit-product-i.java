class Solution {
    public int smallestNumber(int n, int t) {
        int i = n;
        while (true) {
            int pro = 1;
            while (n > 0) {
                pro *= n % 10;
                n /= 10;
            }
            if (pro % t == 0) {
                return i;
            } else {
                i++;
                n = i;
            }
        }

    }
}
