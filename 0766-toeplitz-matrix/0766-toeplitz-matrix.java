class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        if(r==1||c==1){
            return true;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i>0 && j>0 && i<r && j<c && matrix[i][j]!=matrix[i-1][j-1]){
                     return false;
                }
            }
        }
        return true;
    }
}