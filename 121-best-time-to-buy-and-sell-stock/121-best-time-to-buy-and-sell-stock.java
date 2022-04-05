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
        
        /*O(N^2) 
          int profit=0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]<prices[j]){
                    profit=Math.max(profit,prices[j]-prices[i]);
                }
            }
        }
        return profit;
        */
    }
}