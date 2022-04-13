class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        if(nums.length==1){
            ls.add(nums[0]);
            return ls;
        }
        HashMap<Integer, Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            
             if(e.getValue()>nums.length/3){
                        ls.add(e.getKey());
                    
        }
        }
        return ls;
    }
}