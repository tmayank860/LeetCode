class Solution {
    public int minOperations(int[] nums, int x) {
        int target=-x;
        for(int i:nums){
            target+=i;
        }
        if(target==0){
            return nums.length;
        }
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int res=-1,targetSum=0;
        for(int i=0;i<nums.length;i++){
            targetSum+=nums[i];
            if(map.containsKey(targetSum-target)){
                res=Math.max(res,i-map.get(targetSum-target));
            }
            map.put(targetSum,i);
        }
        return res==-1?-1:nums.length-res;
    }
}