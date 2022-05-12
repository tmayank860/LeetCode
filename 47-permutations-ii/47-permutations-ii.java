class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        perm(0,nums,res);
        return res;
    }
    
    static void perm(int idx,int[] nums,List<List<Integer>> res){
        if(idx==nums.length){
            List<Integer> ls=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ls.add(nums[i]);
            }
            // Collections.sort(ls);
            if(!res.contains(ls)){
                res.add(new ArrayList<>(ls));
                return;
            }
            
        }
        for(int i=idx;i<nums.length;i++){
            swap(i,idx,nums);
            perm(idx+1,nums,res);
            swap(i,idx,nums);
        }
    }
     public static void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}