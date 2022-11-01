class Solution {
    public int[] findBall(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int res[] =new int[col];
        for(int i=0;i<col;i++){
            res[i]=dfs(0,i,grid);
        }
        return res;
    }
    static int dfs(int i, int j, int [][]grid){
        if(i>=grid.length){
            return j;
        }
        if(grid[i][j]==1 && grid[0].length>j+1 && grid[i][j+1]==1){
            return dfs(i+1,j+1,grid);
        }else if(grid[i][j]==-1 && j-1>=0 && grid[i][j-1]==-1){
            return dfs(i+1,j-1, grid);
        }else{
            return -1;
        }
    }
}