class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,buy=prices[0];
        for(int i=1;i<prices.length;i++){
           if(buy>prices[i]){
              buy= prices[i];
           }else{
               if(profit<prices[i]-buy){
                   profit=prices[i]-buy;
               }
           }
        }
        return profit;
    }
}