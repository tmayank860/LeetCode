class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if(cost1>total&&cost2>total){
            return 1;
        }
        long sum=0;
        int pen=0;
        while(pen*cost1<=total){
            sum+=(total-(pen*cost1))/cost2+1;
            pen++;
        }
        return sum;
    }
    
}