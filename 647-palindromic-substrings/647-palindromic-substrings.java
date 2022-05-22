class Solution {
    public int countSubstrings(String s) {
           int n=s.length();
        boolean dp[][]=new boolean[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=true;
        }
        for(int i=1;i<n;i++){
        for(int j=0;j<i;j++){
            if(j==i-1){
                if(s.charAt(i)==s.charAt(j)){
                dp[i][j]=true;    
                }
                else{
                    dp[i][j]=false;
                }
            }
            else{
                if(s.charAt(i)==s.charAt(j)&&dp[i-1][j+1]==true){
                    dp[i][j]=true;
                }
                else{
                    dp[i][j]=false;
                }
            }
        }
    }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(dp[i][j]==true)
                    count++;
            }
        }
        return count;
    }
}