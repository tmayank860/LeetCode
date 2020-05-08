package com.company.aprilchallenge.week1;

public class BestTimetoBuyandSellStockII {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int profit=0,p=0;
        for (int i=0;i<prices.length-1;i++){
            for (int j=i+1;j<prices.length;j++){
                if (prices[j]-prices[i]>profit){
                    profit=prices[j]-prices[i];
                }
                p+=profit;
                i++;
                profit=0;

            }
        }
        return p;
    }
}
