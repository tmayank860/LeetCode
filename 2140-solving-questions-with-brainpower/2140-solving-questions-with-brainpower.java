class Solution {
      Map<Integer, Long> hm = new HashMap<>();
    public long mostPoints(int[][] questions) {
       return points(questions,0);
    }
    long points(int[][] q,int idx){
        if(idx>=q.length){
            return 0;
        }
        if(hm.containsKey(idx)){
             return hm.get(idx);
        }
        long exc=points(q, idx + q[idx][1] + 1)+q[idx][0];
        long inc=points(q,idx+1);
        hm.put(idx,Math.max(inc,exc));
        return Math.max(inc,exc);
    }
}