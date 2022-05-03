class Solution {
    public int findUnsortedSubarray(int[] nums) {
         if(nums.length<2){
            return 0;
        }
        int[] arr=new int[nums.length];
        int i=0;
        for(int x:nums){
            arr[i]=x;
            i++;
        }
        int start=0,end=nums.length-1;
        Arrays.sort(arr);
        while(start<nums.length&&arr[start]==nums[start]){
            start++;
        }
         while(end>=0&&arr[end]==nums[end]){
            end--;
        }
        if(end>start){
            return end-start+1;
        }
            return 0;
        
    }
}