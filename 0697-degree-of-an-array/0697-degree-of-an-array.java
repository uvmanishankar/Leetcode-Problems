import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

      
        for (int i = 0; i < nums.length; i++) {

            if (!first.containsKey(nums[i])) {
                first.put(nums[i], i);
            }

            last.put(nums[i], i);

            if (freq.containsKey(nums[i])) {
                freq.put(nums[i], freq.get(nums[i]) + 1);
            } else {
                freq.put(nums[i], 1);
            }
        }

        int degree = 0;

       
        for (int count : freq.values()) {
            if (count > degree) {
                degree = count;
            }
        }

        int minLength = nums.length;

        
        for (int key : freq.keySet()) {

            if (freq.get(key) == degree) {

                int length = last.get(key) - first.get(key) + 1;

                if (length < minLength) {
                    minLength = length;
                }
            }
        }

        return minLength;
    }
}