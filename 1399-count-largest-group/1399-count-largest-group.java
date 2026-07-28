class Solution {
    public int countLargestGroup(int n) {

        int[] freq = new int[37];

        
        for (int i = 1; i <= n; i++) {

            int num = i;
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            freq[sum]++;
        }

      
        int max = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
            }
        }

        
        int count = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == max) {
                count++;
            }
        }

        return count;
    }
}