class Solution {
    public int maxProfit(int[] prices) {
        int[] differences = new int[prices.length-1];
        int maxProfit = 0;

        //finding price difference for each day
        for(int i = 0; i<differences.length; i++){
            differences[i]=prices[i+1]-prices[i];
            if(differences[i]>0){
                maxProfit = maxProfit + differences[i];
            }
        }
        
        return maxProfit;
    }
}