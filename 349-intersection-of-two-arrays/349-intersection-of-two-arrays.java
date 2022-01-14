class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
          Set set1 = new HashSet();
        for(int num:nums1){
            set1.add(num);
        }

        Set set2 = new HashSet();
        for(int num:nums2){
            set2.add(num);
        }

        int[] solution = new int[set1.size()];
        int index = 0;

        for(Object i:set1){
            if(set2.contains(i)){
                solution[index] = (int) i;
                index++;
            }
        }

        return Arrays.copyOf(solution,index);
    }
}