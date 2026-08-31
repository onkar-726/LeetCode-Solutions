class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        String numberStr = Integer.toString(n);

        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }
        int totalS = 0;
        for (int digit : map.keySet()) {
            int count = map.get(digit);
            int result = digit * count;
            totalS += result;
        }

        return totalS;
    }
}