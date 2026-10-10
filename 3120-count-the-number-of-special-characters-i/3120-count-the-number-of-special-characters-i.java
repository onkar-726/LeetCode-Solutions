class Solution {
    public int numberOfSpecialChars(String word) {
        char[] charArray = word.toCharArray();
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];
        int count =0;
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i]; 
            
            if (Character.isLowerCase(c)) {
                lower[c - 'a'] = true;
            } else {
                upper[c - 'A'] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (lower[i] && upper[i]) {
                count++;
            }
        }
        
        return count;
    }
}