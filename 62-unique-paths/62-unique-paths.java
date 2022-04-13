class Solution {
    public int uniquePaths(int m, int n) {
        int[][] res=new int[m][n];
        for (int[] row : res)
            Arrays.fill(row, -1);
        return path(0,0,m,n,res);
    }
    static int path(int i,int j,int m,int n,int[][]res){
        if(i>=m||j>=n){
            return 0;
        }
        if(i==m-1&&j==n-1){
            return 1;
        }
        if(res[i][j]!=-1){
            return res[i][j];
        }else{
           return res[i][j]= path(i+1,j,m,n,res)+path(i,j+1,m,n,res); 
        }
        
    }
}