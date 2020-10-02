/*Qus:->Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
*/


package com.company.aprilchallenge.week1;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums={4,2,2,1,1};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int start=nums[0];
        for (int i=1;i<nums.length;i++){
            start=start ^ nums[i];
        }
        return start;
    }
}
