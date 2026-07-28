class Solution {
    public int maxNumberOfBalloons(String text) {

        int[] count = new int[26];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            count[text.charAt(i) - 'a']++;
        }

        int b = count['b' - 'a'];
        int a = count['a' - 'a'];
        int l = count['l' - 'a'] / 2;
        int o = count['o' - 'a'] / 2;
        int n = count['n' - 'a'];

        int min = b;

        if (a < min)
            min = a;

        if (l < min)
            min = l;

        if (o < min)
            min = o;

        if (n < min)
            min = n;

        return min;
    }
}