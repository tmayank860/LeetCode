class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int r=0,c=n-1;
        int[][] res=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[r][c]=matrix[i][j];
                r++;
            }
            c--;
            r=0;
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=res[i][j];
            }
         }
    }
}