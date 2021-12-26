class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        
        int[] solutionArray = new int[2];
        
        //Copies all but index into new array numsCopy
        int[] numsCopy = new int[nums.length];
        for(int i = 0,j=0; i<nums.length; i++){
            numsCopy[j++]=nums[i];
        }

            //Tests arrays for unique solution
            for(int i = 0; i<nums.length; i++){
                for(int j = 0; j<numsCopy.length; j++){
                    int test = nums[i]+ numsCopy[j];
                    if (test == target && i !=j) {
                        solutionArray[0] = i;
                        solutionArray[1] = j;
                    }
                }
            }
        
       
      return solutionArray;  
    }
    
}