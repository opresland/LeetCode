class Solution {
    public void rotate(int[] nums, int k) {
        int[] rotatedNums = new int[nums.length];
        k = k% nums.length;
        for(int i = 0; i< nums.length; i++){

            if(i<k){
                rotatedNums[i]=nums[nums.length + i - k];
            }else{
                rotatedNums[i]=nums[i - k];
            }
        }
          for(int i = 0; i< nums.length; i++){
            nums[i]=rotatedNums[i];
        }
    }
}