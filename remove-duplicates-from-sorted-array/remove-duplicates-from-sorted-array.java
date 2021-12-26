class Solution {
    public int removeDuplicates(int[] nums) {
                int uniqueNumbers = 1;

        for (int i = 1; i<nums.length; i++) {
            int previousNumber = nums[i-1];

            //counts number of unique numbers
            if(nums[i]!=previousNumber){
                uniqueNumbers++;
                nums[uniqueNumbers-1]=nums[i];
            }

        }

        return uniqueNumbers;
        
        
    }
}