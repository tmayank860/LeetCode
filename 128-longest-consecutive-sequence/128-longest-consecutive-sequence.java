class Solution {
    public int longestConsecutive(int[] nums) {
      Set<Integer> hs=new HashSet<>();
        for (int i=0;i<nums.length;i++){
           hs.add(nums[i]);
        }
        int max = 0;
        int size = 0;
        for (int i=0;i<nums.length;i++){
            if(hs.contains(nums[i] - 1)) continue;
            size = 1;

            while( hs.contains(nums[i] + size)){
                hs.remove(nums[i] + size);
                size++;
            }

            max = Math.max(max , size);
        }
        return max;
    }
}