class Solution {
    public int searchInsert(int[] nums, int target) {
        int leftMost = 0;
        int rightMost = nums.length-1;
        int mid = 0;
        
        if(target>nums[rightMost]) return nums.length;
        if(target<=nums[leftMost]) return 0;
        
        while(leftMost<rightMost){
            

            mid = leftMost + (rightMost-leftMost)/2;
            
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                leftMost = mid;
            }else{
                rightMost = mid;
            }
            
            if(rightMost == (leftMost+1)){
                return rightMost;
            }
            
        }
        return mid;
        
    }
}