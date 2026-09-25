class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int var = nums[i];
            String numberStr = String.valueOf(var);
            for (int j = 0; j < numberStr.length(); j++) {
                char digitChar = numberStr.charAt(j);
                answer.add(Character.getNumericValue(digitChar));
            }
        }
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;

    }
}