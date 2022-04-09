class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                 hm.put(nums[i],1);
            }
        }
       Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a));
          int[] arr=new int[k];
      
        for(int key:hm.keySet()){
            maxHeap.add(key);
        }
       
      
        for(int i=0;i<k;i++){
            arr[i]=maxHeap.poll();
        }
        return arr;
    }
}