class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
         }
    
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
             int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;    
            }
         }
        
        /*int r=0,c=n-1;
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
         }*/
    }
}