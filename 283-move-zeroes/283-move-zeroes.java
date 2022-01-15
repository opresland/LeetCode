class Solution {
    public void moveZeroes(int[] nums) {
                int comparison = 0;

        for(int i=0; i<nums.length-1; i++){

            if(nums[i]==0){
                comparison = i+1;

                while(nums[comparison]==0 && comparison<nums.length-1){
                    comparison++;
                }


                nums[i] = nums[comparison];
                nums[comparison] = 0;
            }
        }
    }
}