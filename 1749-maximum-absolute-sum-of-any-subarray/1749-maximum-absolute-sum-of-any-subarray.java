class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxEnding = 0;
        int minEnding = 0;

        int maxSum = 0;
        int minSum = 0;

        for (int i = 0; i < nums.length; i++) {

         
            if (maxEnding + nums[i] > nums[i]) {
                maxEnding = maxEnding + nums[i];
            } else {
                maxEnding = nums[i];
            }

            if (maxEnding > maxSum) {
                maxSum = maxEnding;
            }

      
            if (minEnding + nums[i] < nums[i]) {
                minEnding = minEnding + nums[i];
            } else {
                minEnding = nums[i];
            }

            if (minEnding < minSum) {
                minSum = minEnding;
            }
        }

  
        if (maxSum > -minSum) {
            return maxSum;
        } else {
            return -minSum;
        }
    }
}