class Solution {
    int[][][] dp;
    public int findMaxForm(String[] strs, int m, int n) {
        dp=new int[m+1][n+1][strs.length];
        return subsetSize(strs,m,n,0);
    }
    int subsetSize(String[] strs,int zero,int one,int idx){
        if(idx==strs.length||one+zero==0){
            return 0;
        }
        
        if(dp[zero][one][idx]>0){
            return dp[zero][one][idx];
        }
        
        
        int[] count=count(strs[idx]);
        
        int consider=0;
        
        if(zero>=count[0]&&one>=count[1]){
            consider=1+subsetSize(strs,zero-count[0],one-count[1],idx+1);
        }
        
        int skip=subsetSize(strs,zero,one,idx+1);
         dp[zero][one][idx]=Math.max(consider,skip);
        return  dp[zero][one][idx];
    }
    
    int[] count(String s){
        int [] count=new int[2];
        for(char c:s.toCharArray()){
            count[c-'0']++;
        }
        return count;
    }
}