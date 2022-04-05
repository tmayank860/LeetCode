class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        if(n<=1){
            return intervals;
        }
       Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> res=new ArrayList<>();
         int start=intervals[0][0],end=intervals[0][1];
        int i=0;
        for(i=1;i<intervals.length;i++){
            if(end>=intervals[i][0]){
                end=intervals[i][1]>end?intervals[i][1]:end;
            }else{
                 int[] ls=new int[2];
            ls[0]=start;
            ls[1]=end;
            res.add(ls);
            start=intervals[i][0];
            end=intervals[i][1];
            }
             
            
        }
         
         res.add(new int[]{start,end});


        return res.toArray(new int[res.size()][]);
    }
}