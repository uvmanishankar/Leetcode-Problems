class Solution {
    public int findLucky(int[] arr) {

        int[] freq = new int[501];

        // Count frequencies
        for (int num : arr) {
            freq[num]++;
        }

        // Find largest lucky integer
        for (int i = 500; i >= 1; i--) {
            if (freq[i] == i) {
                return i;
            }
        }

        return -1;
    }
}