class Solution {
    public List<Integer> intersection(int[][] nums) {
         ArrayList<Integer> ls=new ArrayList<>();
         ArrayList<Integer> res=new ArrayList<>();
            for(int j=0;j<nums[0].length;j++){
                ls.add(nums[0][j]);
        }
     for(int s=0;s<ls.size();s++){
         int flag=1;
            for(int i=1;i<nums.length;i++){
              ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<nums[i].length;j++){
              temp.add(nums[i][j]);
            }
                if(!temp.contains(ls.get(s))){
                    flag=0;
                }
        }
         if(flag==1){
             res.add(ls.get(s));
         }
     }
        Collections.sort(res);
        return res;
    }
}
// public List<Integer> intersection(int[][] nums) {
//         Map<Integer,Integer> map = new HashMap<>();
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 0; j < nums[i].length; j++) {
//                 int value = map.getOrDefault(nums[i][j],0);
//                 map.put(nums[i][j],++value);
//             }
//         }
//         List<Integer> result = new ArrayList<>();
//         for (int key:
//              map.keySet()) {
//             if (map.get(key) == nums.length) {
//                 result.add(key);
//             }
//         }
//         Collections.sort(result);
//         return result;
//     }