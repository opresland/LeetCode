class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        
        //selecting largest poss. number
        for(int i=numbers.length-1; i>0; i--){
                //selecting smallest possible
                for(int j=0; j<i; j++){
                    if(numbers[i]+numbers[j] > target){
                        break;
                    }else if(numbers[i]+numbers[j] == target){
                        int[] result = {j+1,i+1};
                        return result;
                    }
                }
        }
        
        return new int[2];
    }
}