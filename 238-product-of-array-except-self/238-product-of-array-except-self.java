class Solution {
    public int[] productExceptSelf(int[] nums) {
        long prod=1,zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                prod*=nums[i];
            }else{
                zero++;
            }
        }
        if(zero>1){
            Arrays.fill(nums,0);
            return nums;
        }
        if(zero==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    nums[i]=(int)prod;
                }else{
                    nums[i]=0;
                }
            }
            return nums;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=(int)prod/nums[i];
        }
        return nums;
    }
}