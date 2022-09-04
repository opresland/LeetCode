class Solution {
    public void moveZeroes(int[] nums) {
                int comparison = 0;

        for(int i=0; i<nums.length-1; i++){

            if(nums[i]==0){
                comparison = i+1;

                while(nums[comparison]==0 && comparison<nums.length-1){
                    comparison++;
                }

                System.out.println(nums[i]+" in position "+i+" is being compared with "+nums[comparison]+" in position "+comparison);

                nums[i] = nums[comparison];
                nums[comparison] = 0;
            }
        }
    }
}