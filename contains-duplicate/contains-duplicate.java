import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set tempSet = new HashSet();
        for(int num:nums){
            if(!tempSet.add(num)){
                return true;
            }
        }
        return false;
    }
}