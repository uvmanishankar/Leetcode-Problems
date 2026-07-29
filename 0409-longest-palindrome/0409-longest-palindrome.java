class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

       
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        int length = 0;
        boolean oddFound = false;

        for (int freq : map.values()) {

            if (freq % 2 == 0) {
                length += freq;
            } else {
                length += freq - 1;
                oddFound = true;
            }
        }

        if (oddFound) {
            length++;
        }

        return length;
    }
}