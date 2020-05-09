package com.company.aprilchallenge.week1;

public class MaxiumSum {
    public static void main(String[] args) {
int arr[]={-1,-2};
System.out.println(maxSubarray(arr));
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
}
