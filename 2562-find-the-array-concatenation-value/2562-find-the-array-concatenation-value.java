class Solution {
    public long findTheArrayConcVal(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        long ans = 0;

        while (left <= right) {

            if (left == right) {
                ans += nums[left];
            } else {
                int temp = nums[right];
                int multiplier = 1;

                while (temp > 0) {
                    multiplier *= 10;
                    temp /= 10;
                }

                ans += (long) nums[left] * multiplier + nums[right];
            }

            left++;
            right--;
        }

        return ans;
    }
}