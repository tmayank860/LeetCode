package com.company.aprilchallenge.week1;

import java.util.HashSet;

public class MaxiumSum {
    public static void main(String[] args) {
//int arr[]={-1,-2};
//System.out.println(maxSubarray(arr));
        int[] arr={2,3,-2,4};
        System.out.println(maxProduct(arr));
    }

    public static int maxSubArray(int[] nums) {
        int sum=0,max=Integer.MIN_VALUE;
        if (nums.length==1){
            return nums[0];
        }
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<=nums.length;j++){
                for (int k=i;k<j;k++){
//                    System.out.print(nums[k]+" ");
                    sum=sum+nums[k];
                }
//                System.out.println();
                if (sum>max){
                    max=sum;
                }
                sum=0;
            }
        }
        return max;
    }

//    Method 2

    public static int maxSubarray(int[] nums){
        int max_sum=nums[0];
        int current_sum=nums[0];
        for (int i=1;i<nums.length;i++){
            current_sum=Math.max(current_sum+nums[i],nums[i]);
            max_sum=Math.max(current_sum,max_sum);
        }
        return max_sum;
    }

    public static int firstDuplicate(int[] arr){
        int duplicate=0,i=0;
        HashSet<Integer> hs=new HashSet();

        while(!hs.contains(arr[i])){
            hs.add(arr[i]);
            i++;
        }
        return arr[i];

    }

    public static int maxProduct(int[] nums){
        int max_p=nums[0];
        int min_p=nums[0];
        int final_max=nums[0];
        for (int i=1;i<nums.length;i++){
            int temp=max_p;
            max_p=Math.max(Math.max(max_p*nums[i],min_p*nums[i]),nums[i]);
            min_p=Math.min(Math.min(temp*nums[i],min_p*nums[i]),nums[i]);
            final_max=Math.max(max_p,final_max);
        }
        return final_max;
    }
}
