class Solution {
    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        while (n != 1 && n != 4) {
            int sum = 0;
            int x = n;

            while (x > 0) {
                int a = x % 10;
                x /= 10;
                sum += a * a;
            }
            n = sum;

            if (sum == 1) {
                return true;
            }
        }
        return false;
    }
}