class Solution {
    public int[] twoSum(int[] nums, int target) {
       int left=0,right=nums.length-1;
        int res[]=new int[2];
        while(left<right){
            if(nums[left]+nums[right]==target){
                res[0]=left+1;
                res[1]=right+1;
                return res;
            }else if(nums[left]+nums[right]>target){
                right--;
            }else{
                left++;
            }
        }
        return res;
    }
}