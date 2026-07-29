class Solution {
    public char findTheDifference(String s, String t) {

        int[] count = new int[26];

        // Count characters in s
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Find the extra character in t
        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (count[ch - 'a'] == 0) {
                return ch;
            }

            count[ch - 'a']--;
        }

        return ' ';
    }
}