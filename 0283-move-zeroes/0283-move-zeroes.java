class Solution {
    public void moveZeroes(int[] nums) {
        int size=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                size++;
            }
            else if(size>0){
                int temp=nums[i];
                nums[i]=0;
                nums[i-size]=temp;
            }
        }
    }
}